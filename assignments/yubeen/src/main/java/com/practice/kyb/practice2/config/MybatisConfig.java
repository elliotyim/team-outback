package com.practice.kyb.practice2.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 이 클래스가 설정파일임을 명시하고 IoC 컨테이너가 이 클래스를 참조하여 객체를 만들게 한다.
@Configuration

// 지정해준 경로에 있는 DAO를 스캔하여 Mapper와 매칭시킨다.
@MapperScan("com.practice.kyb.practice2.dao")
public class MybatisConfig {
  
  @Bean
  public SqlSessionFactory sqlSessionFactory(
      DataSource dataSource, ApplicationContext appCtx) throws Exception {

    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(dataSource);
    sqlSessionFactoryBean.setTypeAliasesPackage("com.practice.kyb.practice2.domain");
    sqlSessionFactoryBean.setMapperLocations(
        appCtx.getResources("classpath:com/practice/kyb/mapper/MemberMapper2.xml"));
    
    return sqlSessionFactoryBean.getObject();
  }
}
