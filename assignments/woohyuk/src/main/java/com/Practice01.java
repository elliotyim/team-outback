package com;

import java.sql.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.domain.Student;

public class Practice01 {
  
  private final static Logger logger = LogManager.getLogger(Practice01.class);
  
  public static void main(String[] args) {
    
    ApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext(AppConfig.class);
    
    Student obj = (Student) iocContainer.getBean("student");
    obj.setNo(1);
    obj.setName("홍길동");
    obj.setEmail("hong@test.com");
    obj.setRegisteredDate(new Date(System.currentTimeMillis()));
    logger.info(obj);
  }
}
