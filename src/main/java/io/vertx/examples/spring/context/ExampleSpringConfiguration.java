package io.vertx.examples.spring.context;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

/**
 * Simple Java Spring configuration to be used for the Spring example application. This configuration is mainly
 * composed of a database configuration and initial population via the script "products.sql" of the database for
 * querying by our Spring service bean.
 *
 * The Spring service bean and repository are scanned for via @EnableJpaRepositories and @ComponentScan annotations
 */
@Configuration
@PropertySource(value = { "classpath:applicationMysql.properties" })
@ComponentScan("io.vertx.examples.spring.service")
@MapperScan(value="io.vertx.examples.spring.repository")
public class ExampleSpringConfiguration {

  @Autowired
  private Environment env;

  @Bean
  @Autowired
  public DataSource dataSource(DatabasePopulator populator) {
    final DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
    dataSource.setUrl(env.getProperty("jdbc.url"));
    dataSource.setUsername(env.getProperty("jdbc.username"));
    dataSource.setPassword(env.getProperty("jdbc.password"));
    DatabasePopulatorUtils.execute(populator, dataSource);
    return dataSource;
  }
  
  @Bean
  @Autowired
  public SqlSessionFactory sqlSessionFactory(final DataSource dataSource) throws Exception {
      SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
      sessionFactory.setDataSource(dataSource);
      
      PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
      sessionFactory.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
      return sessionFactory.getObject();
  }

  @Bean
  public DataSourceTransactionManager transactionManager(final DataSource dataSource) {
      return new DataSourceTransactionManager(dataSource);
  }
  

  @Bean
  @Autowired
  public DatabasePopulator databasePopulator() {
    final ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
    populator.setContinueOnError(false);
    populator.addScript(new ClassPathResource("productsMysql.sql"));
    return populator;
  }

}
