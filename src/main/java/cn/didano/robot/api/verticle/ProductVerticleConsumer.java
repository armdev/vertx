package cn.didano.robot.api.verticle;

import org.springframework.context.ApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import cn.didano.robot.api.common.Result;
import cn.didano.robot.api.model.Product;
import cn.didano.robot.api.service.DeviceService;
import cn.didano.robot.api.service.ProductService;

/**
 * Simple verticle to wrap a Spring service bean - note we wrap the service call
 * in executeBlocking, because we know it's going to be a JDBC call which
 * blocks. As a general principle with Spring beans, the default assumption
 * should be that it will block unless you know for sure otherwise (in other
 * words use executeBlocking unless you know for sure your service call will be
 * extremely quick to respond)
 */
public class ProductVerticleConsumer extends AbstractVerticle {

	public static final String ALL_PRODUCTS_ADDRESS = "example.all.products";
	public static final String ADD_PRODUCT = "add.product";
	public static final String GetSchoolKey = "getSchoolKey";

	// Reuse the Vert.x Mapper, alternatively you can use your own.
	private final ObjectMapper mapper = Json.mapper;

	private final ProductService service;
	private final DeviceService deviceService;

	public ProductVerticleConsumer(final ApplicationContext context) {
		service = (ProductService) context.getBean("productService");
		deviceService = (DeviceService) context.getBean("deviceService");
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
		vertx.eventBus().<String>consumer(GetSchoolKey).handler(message -> vertx.<String>executeBlocking(future -> {
			try {
				Result result = deviceService.getSchoolKey(message.body());
				future.complete(mapper.writeValueAsString(result));
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
