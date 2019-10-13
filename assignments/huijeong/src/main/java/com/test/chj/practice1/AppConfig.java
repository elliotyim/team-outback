package com.test.chj.practice1;

import java.sql.Date;
import org.springframework.context.annotation.Bean;
import com.test.chj.practice1.domain.Student;

public class AppConfig {
  
  @Bean public Student student () {
    
    Student stu = new Student();
    stu.setNo(1);
    stu.setName("홍길동");
    stu.setEmail("hong@test.com");
    stu.setRegisteredDate(Date.valueOf("2019-09-16"));
    
    return stu;
  
  }

}
