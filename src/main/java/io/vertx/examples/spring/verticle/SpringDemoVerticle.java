package io.vertx.examples.spring.verticle;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.examples.spring.entity.Product;
import io.vertx.examples.spring.service.ProductService;

import java.util.Random;

import org.apache.shiro.session.mgt.eis.RandomSessionIdGenerator;
import org.springframework.context.ApplicationContext;

/**
 * Simple verticle to wrap a Spring service bean - note we wrap the service call
 * in executeBlocking, because we know it's going to be a JDBC call which
 * blocks. As a general principle with Spring beans, the default assumption
 * should be that it will block unless you know for sure otherwise (in other
 * words use executeBlocking unless you know for sure your service call will be
 * extremely quick to respond)
 */
public class SpringDemoVerticle extends AbstractVerticle {

	public static final String ALL_PRODUCTS_ADDRESS = "example.all.products";
	public static final String ADD_PRODUCT = "add.product";

	// Reuse the Vert.x Mapper, alternatively you can use your own.
	private final ObjectMapper mapper = Json.mapper;

	private final ProductService service;

	public SpringDemoVerticle(final ApplicationContext context) {
		service = (ProductService) context.getBean("productService");
	}

	private Handler<Message<String>> allProductsHandler(ProductService service) {
		// It is important to use an executeBlocking construct here
		// as the service calls are blocking (dealing with a database)
		return msg -> vertx.<String>executeBlocking(future -> {
			try {
				future.complete(mapper.writeValueAsString(service.getAllProducts()));
			} catch (JsonProcessingException e) {
				System.out.println("Failed to serialize result");
				future.fail(e);
			}
		}, result -> {
			if (result.succeeded()) {
				msg.reply(result.result());
			} else {
				msg.reply(result.cause().toString());
			}
		});
	}
	
	
	/**
	 * 保存 产品信息
	 * @param service2
	 * @return
	 */
	private Handler<Message<String>> addProductsHandler(Message<Product> message,ProductService service) {
		System.out.println(" ready save product ...");
		return msg -> vertx.<String>executeBlocking(future -> {
			try {
				
//				future.complete(mapper.writeValueAsString(service.saveProduct(message.body())));
				service.saveProduct(message.body());
				future.complete(mapper.writeValueAsString(""));
			} catch (JsonProcessingException e) {
				System.out.println("Failed to serialize result");
				future.fail(e);
			}
		}, result -> {
			if (result.succeeded()) {
				msg.reply(result.result());
			} else {
				msg.reply(result.cause().toString());
			}
		});
	}

	@Override
	public void start() throws Exception {
		super.start();
		vertx.eventBus().<String>consumer(ALL_PRODUCTS_ADDRESS).handler(allProductsHandler(service));
		vertx.eventBus().<Product>consumer(ADD_PRODUCT).handler(message -> vertx.<String>executeBlocking(future -> {
			try {
				service.saveProduct(message.body());
				future.complete(mapper.writeValueAsString(""));
			} catch (JsonProcessingException e) {
				System.out.println("Failed to serialize result");
				future.fail(e);
			}
		}, result -> {
			if (result.succeeded()) {
				message.reply(result.result());
			} else {
				message.reply(result.cause().toString());
			}
		}));
	}
}
