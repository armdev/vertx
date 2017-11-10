package cn.didano.robot.api;

import cn.didano.robot.api.verticle.ProductVerticleConsumer;
import io.vertx.core.Vertx;
import cn.didano.robot.api.context.SpringConfiguration;
import cn.didano.robot.api.verticle.ServerVerticle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Runner for the vertx-spring sample
 *
 */
public class VertXRunner {

  public static void main( String[] args ) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    final Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new ProductVerticleConsumer(context));
    vertx.deployVerticle(new ServerVerticle());
    System.out.println("Deployment done");
  }

}
