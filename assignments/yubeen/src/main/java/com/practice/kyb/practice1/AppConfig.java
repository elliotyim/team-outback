package com.practice.kyb.practice1;

import java.sql.Date;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.practice.kyb.practice1.domain.Student;

@ComponentScan("com.practice.kyb")
public class AppConfig {
  
  @Bean public Student student() {
    
    Student obj = new Student();
    obj.setNo(1);
    obj.setName("김유빈");
    obj.setEmail("kyb@test.com");
    obj.setRegisteredDate(Date.valueOf("2019-09-16"));
    
    return obj;
  }

}
