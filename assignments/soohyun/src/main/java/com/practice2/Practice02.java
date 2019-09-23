package com.practice2;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.practice2.dao.MemberDao;
import com.practice2.domain.Member;

public class Practice02 {

  public static void main(String[] args) throws Exception {
    ApplicationContext appCtx =
        new AnnotationConfigApplicationContext("com.practice2.config");
    
    List<Member> members = appCtx.getBean(MemberDao.class).findAll();
    for (Member m : members) {
      System.out.println(m);
    }
  }
  
}
