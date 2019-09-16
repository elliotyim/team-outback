package com.el.asm.practice1;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.el.asm.practice1.domain.Student;

public class Practice01_1 {

  public static void main(String[] args) {
    
    ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
    
    appCtx.getBean("student", Student.class)
      .setNo(1)
      .setName("홍길동")
      .setEmail("hong@test.com")
      .setRegisteredDate(Date.valueOf("2019-9-16"));
    System.out.println(appCtx.getBean("student"));
  }
}
