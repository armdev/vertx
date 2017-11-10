package com.didano.verx;

import io.vertx.core.Vertx;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by chengen on 26/04/2017.
 */
@RunWith(VertxUnitRunner.class)
public class WebVerticleTest {

    private Vertx vertx;

    @Before
    public void setUp(TestContext context) {
        vertx = Vertx.vertx();
        vertx.deployVerticle(WebVerticle.class.getName(), context.asyncAssertSuccess());
    }

    @After
    public void tearDown(TestContext context) {
        vertx.close(context.asyncAssertSuccess());
    }

    /**
     * 断言 服务器返回的消息正确
     * @param context
     */
    @Test
    public void testWebApplication(TestContext context) {
    	final Async async = context.async();
    	
    	vertx.createHttpClient().getNow(8080, "localhost", "/", response -> {
    		response.handler(body -> {
    			context.assertTrue(body.toString().contains("Hello World from Vert.x-Web!"));
    			async.complete();
    		});
    	});
    }
}
