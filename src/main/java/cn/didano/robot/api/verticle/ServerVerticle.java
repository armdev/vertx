package cn.didano.robot.api.verticle;

import java.util.Date;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import cn.didano.robot.api.model.Product;
import cn.didano.robot.api.messagecodec.ProductCodec;

/**
 * Simple web server verticle to expose the results of the Spring service bean
 * call (routed via a verticle - see ProductVerticleConsumer)
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
					vertx.eventBus().<String>send(ProductVerticleConsumer.ALL_PRODUCTS_ADDRESS, "", result -> {
						if (result.succeeded()) {
							req.response().setStatusCode(200).write(result.result().body()).end();
						} else {
							req.response().setStatusCode(500).write(result.cause().toString()).end();
						}
					});
				} else if (req.path().equals("/cardDevice/getSchoolKey")) {
					String deviceNo = req.getHeader("device_no");
					vertx.eventBus().<String>send(ProductVerticleConsumer.GetSchoolKey, deviceNo, result -> {
						if (result.succeeded()) {
							req.response().putHeader(HttpHeaders.CONTENT_TYPE, "application/json").setStatusCode(200).write(result.result().body()).end();
						} else {
							req.response().setStatusCode(500).write(result.cause().toString()).end();
						}
					});
				}  else if (req.path().equals("/addProduct")) {
					String desc = req.getParam("desc");
					Product p = new Product();
					p.setDescription("serverGen");
					p.setCreateTime(new Date());
					vertx.eventBus().<String>send(ProductVerticleConsumer.ADD_PRODUCT, p, result -> {
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
