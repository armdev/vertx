package io.vertx.examples.test.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;


/**
 * 第一个 web处理器
 * @author TOPFEEL
 *
 */
public class WebVerticle extends AbstractVerticle {
	public void start() {
		HttpServer server = vertx.createHttpServer();

		Router router = Router.router(vertx);

		router.route().handler(routingContext -> {

		  // 所有的请求都会调用这个处理器处理
		  HttpServerResponse response = routingContext.response();
		  response.putHeader("content-type", "text/plain");

		  // 写入响应并结束处理
		  response.end("Hello World from Vert.x-Web!");
		});

		server.requestHandler(router::accept).listen(8080);
	}
}
