package cn.didano.robot.api.context;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
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
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Simple Java Spring configuration to be used for the Spring example application. This configuration is mainly
 * composed of a database configuration and initial population via the script "products.sql" of the database for
 * querying by our Spring service bean.
 *
 * The Spring service bean and dao are scanned for via @EnableJpaRepositories and @ComponentScan annotations
 */
@Configuration
@PropertySource(value = { "classpath:applicationMysql.properties" })
@ComponentScan("cn.didano.robot.api.service")
@MapperScan(value="cn.didano.robot.api.dao")
@EnableTransactionManagement
public class SpringConfiguration {

  @Autowired
  private Environment env;

  @Bean
  @Autowired
  public DataSource dataSource(DatabasePopulator populator) {
  /*  final DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
    dataSource.setUrl(env.getProperty("jdbc.url"));
    dataSource.setUsername(env.getProperty("jdbc.username"));
    dataSource.setPassword(env.getProperty("jdbc.password"));*/

    DruidDataSource dataSource = new DruidDataSource();

    dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));

    dataSource.setUrl(env.getProperty("jdbc.url"));

    dataSource.setUsername(env.getProperty("jdbc.username"));

    dataSource.setPassword(env.getProperty("jdbc.password"));
    dataSource.setMaxActive(Integer.parseInt(env.getProperty("jdbc.maxActive")));
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
