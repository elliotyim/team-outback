package com.practice1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Practice01 {
  private static final Logger logger = LogManager.getLogger(Practice01.class);

  public static void main(String[] args) {
    ApplicationContext iocContainer =
        new AnnotationConfigApplicationContext(AppConfig.class);
    
    logger.info(iocContainer.getBean("student"));
    
    
  }
}
