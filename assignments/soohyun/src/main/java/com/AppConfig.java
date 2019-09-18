package com;

import java.sql.Date;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.domain.Student;

@ComponentScan("com")
public class AppConfig {
  
  @Bean
  public Student student() {
    Student s1 = new Student();
    s1.setNo(1);
    s1.setName("홍길동");
    s1.setEmail("hong@test.com");
    s1.setRegisteredDate(new Date(System.currentTimeMillis()));
    return s1;
  }
  
  
}
