package com.practice.kyb.practice2;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.practice.kyb.practice2.dao.MemberDao;
import com.practice.kyb.practice2.domain.Member;

public class Practice02 {

  public static void main(String[] args) throws Exception {
    
    // AnnotationConfigApplicationContext 컨테이너에 패키지명을 알려주면 
    // 그 패키지에 있는 @Component, @Service, @Repository, @Controller 객체를 생성한다.
    // 만약 클래스들 중에서 @Configuration 애노테이션이 붙은 클래스가 있다면 
    // Java config 클래스로 인식하여 자동으로 처리한다.
    ApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext("com.practice.kyb.practice2.config");

    List<Member> memberList = iocContainer.getBean(MemberDao.class).findAll();
    for (Member m : memberList) {
      System.out.println(m);
    }
  }
}
