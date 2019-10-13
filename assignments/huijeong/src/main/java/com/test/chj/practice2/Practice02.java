package com.test.chj.practice2;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.test.chj.practice2.dao.MemberDao;
import com.test.chj.practice2.domain.Member;

public class Practice02 {

  public static void main(String[] args) throws Exception {
    ApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext("com.test.chj.practice2.config");

    List<Member> memberList = iocContainer.getBean(MemberDao.class).findAll();
    for (Member m : memberList) {
      System.out.println(m);
    }
  }
}
