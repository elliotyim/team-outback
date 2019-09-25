package com.practice2.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:com/conf/jdbc.properties")
public class DatabaseConfig {
  @Value("${jdbc.driver}") String jdbcDriver;
  @Value("${jdbc.url}") String jdbcUrl;
  @Value("${jdbc.username}") String jdbcuserName;
  @Value("${jdbc.password}") String jdbcPassword;
  
  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName(this.jdbcDriver);
    ds.setUrl(this.jdbcUrl);
    ds.setUsername(this.jdbcuserName);
    ds.setPassword(this.jdbcPassword);
    
    return ds;
  }
  
}
