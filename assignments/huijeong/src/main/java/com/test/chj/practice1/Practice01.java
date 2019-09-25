package com.test.chj.practice01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.test.chj.practice01.domain.Student;

public class Practice01 {

  public static void main(String[] args) {
    
    ApplicationContext appCtx = 
        new AnnotationConfigApplicationContext(AppConfig.class);

    Student obj = (Student) appCtx.getBean("student");
    System.out.println(obj);
    
  }

}
