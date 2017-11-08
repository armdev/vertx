package io.vertx.examples.spring.verticle;

import java.util.Date;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.examples.spring.entity.Product;
import io.vertx.examples.spring.messagecodec.ProductCodec;

/**
 * Simple web server verticle to expose the results of the Spring service bean
 * call (routed via a verticle - see SpringDemoVerticle)
 */
public class ServerVerticle extends AbstractVerticle {

	@Override
	public void start() throws Exception {
		super.start();
		
		EventBus eventBus = getVertx().eventBus();

	    // 注册 客户消息解码器
	    eventBus.registerDefaultCodec(Product.class, new ProductCodec());
	    
		HttpServer server = vertx.createHttpServer();
		server.requestHandler(req -> {
			if (req.method() == HttpMethod.GET) {
				req.response().setChunked(true);

				if (req.path().equals("/products")) {
					vertx.eventBus().<String>send(SpringDemoVerticle.ALL_PRODUCTS_ADDRESS, "", result -> {
						if (result.succeeded()) {
							req.response().setStatusCode(200).write(result.result().body()).end();
						} else {
							req.response().setStatusCode(500).write(result.cause().toString()).end();
						}
					});
				} else if (req.path().equals("/addProduct")) {
					String desc = req.getParam("desc");
					Product p = new Product();
					p.setDescription("serverGen");
					p.setCreateTime(new Date());
					vertx.eventBus().<String>send(SpringDemoVerticle.ADD_PRODUCT, p, result -> {
						if (result.succeeded()) {
							req.response().setStatusCode(200).write(result.result().body()).end();
						} else {
							req.response().setStatusCode(500).write(result.cause().toString()).end();
						}
					});
				} else {
					req.response().setStatusCode(200).write("Hello from vert.x").end();
				}

			} else {
				// We only support GET for now
				req.response().setStatusCode(405).end();
			}
		});

		server.listen(8080);
	}
}
