package com.el.asm.practice2.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration

//<tx:annotation-driven/> 의 Java Config 설정
// => @Transactional 애노테이션을 처리할 객체를 등록한다.
@EnableTransactionManagement 

@PropertySource("classpath:com/el/asm/conf/jdbc.properties")
public class DatabaseConfig {
  
  @Value("${jdbc.driver}") String jdbcDriver;
  @Value("${jdbc.url}") String jdbcUrl;
  @Value("${jdbc.username}") String jdbcUsername;
  @Value("${jdbc.password}") String jdbcPassword;
  
  @Bean
  public DataSource dataSource() {
    // spring-jdbc 라이브러리에서 제공해주는 클래스를 사용하여 DataSource 구현체 만들기
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName(this.jdbcDriver); 
    ds.setUrl(this.jdbcUrl);
    ds.setUsername(this.jdbcUsername);
    ds.setPassword(this.jdbcPassword);
    return ds;
  }
  
  @Bean
  public PlatformTransactionManager transactionManager(DataSource dataSource) {
    // 트랜잭션 관리자를 생성할 때 DataSource(DB 커넥션풀) 구현체를 요구한다.
    // Spring IoC 컨테이너에 들어 있는 것을 꺼내기 위해 
    // 파라미터로 선언하라.
    return new DataSourceTransactionManager(dataSource);
  }
}






