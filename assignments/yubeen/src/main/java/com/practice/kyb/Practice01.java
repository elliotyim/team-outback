package com.practice.kyb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Practice01 {

  public static void main(String[] args) {
    
    ApplicationContext iocContainer =
        new AnnotationConfigApplicationContext(AppConfig.class);
    
    System.out.println(iocContainer.getBean("student"));
    
  }

}
