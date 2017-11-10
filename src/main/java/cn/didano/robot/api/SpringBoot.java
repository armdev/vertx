package cn.didano.robot.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.filter.CharacterEncodingFilter;


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
    
    
    @Bean
    public CharacterEncodingFilter initializeCharacterEncodingFilter() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return filter;
    }
}

