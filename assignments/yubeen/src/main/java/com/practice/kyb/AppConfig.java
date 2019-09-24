package com.practice.kyb;

import java.sql.Date;
import org.springframework.context.annotation.Bean;
import com.practice.kyb.domain.Student;

public class AppConfig {
  
  @Bean public Student student() {
    
    Student obj = new Student();
    obj.setNo(1);
    obj.setName("김유빈");
    obj.setEmail("kyb@test.com");
    obj.setRegisteredDate(new Date(System.currentTimeMillis()));
    
    return obj;
  }

}
