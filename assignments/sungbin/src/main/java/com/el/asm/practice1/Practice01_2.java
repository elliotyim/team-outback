package com.el.asm.practice1;

import java.sql.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.el.asm.practice1.domain.Student;

public class Practice01_2 {

  private static final Logger logger = LogManager.getLogger(Practice01_2.class);

  public static void main(String[] args) {
    
    ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
    
    appCtx.getBean("student", Student.class)
      .setNo(1)
      .setName("홍길동")
      .setEmail("hong@test.com")
      .setRegisteredDate(Date.valueOf("2019-9-16"));
    
    logger.info(appCtx.getBean("student"));
  }
}
