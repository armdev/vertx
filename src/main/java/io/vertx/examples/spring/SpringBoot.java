package io.vertx.examples.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * API 文档生成
 * 
 * http://127.0.0.1:8080/v2/api-docs<p>
 * http://127.0.0.1:8080/swagger-ui.html<p>
 * 
 * @author sheng.he@didano.cn
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }
}

