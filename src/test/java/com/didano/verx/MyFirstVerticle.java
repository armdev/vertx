package com.didano.verx;

import io.vertx.core.AbstractVerticle;


/**
 * 第一个 处理器
 * @author TOPFEEL
 *
 */
public class MyFirstVerticle extends AbstractVerticle {
	public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello World!");
		}).listen(8080);
	}
}
