package com.practice.kyb.practice2.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 이 클래스가 @Transactional 애노테이션이 붙은 메서드를 처리할 객체로 설정한다.
@EnableTransactionManagement

// 이 클래스가 설정파일임을 명시하고 IoC 컨테이너가 이 클래스를 참조하여 객체를 만들게 한다.
@Configuration

// properties 파일을 참조하게 한다.
@PropertySource("classpath:com/practice/kyb/conf/jdbc.properties")
public class DatabaseConfig {
  
  // String 레퍼런스에 값을 넘겨준다.
  @Value("${jdbc.driver}") String jdbcDriver;

  @Value("${jdbc.url}") String jdbcUrl;
  
  @Value("${jdbc.username}") String jdbcUsername;
  
  @Value("${jdbc.password}") String jdbcPassword;
  
  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName(this.jdbcDriver); 
    ds.setUrl(this.jdbcUrl);
    ds.setUsername(this.jdbcUsername);
    ds.setPassword(this.jdbcPassword);
    return ds;
  }
  
  @Bean
  public PlatformTransactionManager transactionManager(DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }

}
