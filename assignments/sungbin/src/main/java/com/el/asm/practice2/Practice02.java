package com.el.asm.practice2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.el.asm.practice2.dao.MemberDao;
import com.el.asm.practice2.domain.Member;

public class Practice02 {

  public static void main(String[] args) throws Exception {
    ApplicationContext appCtx =
        new AnnotationConfigApplicationContext("com.el.asm.practice2.config");
    
    // FindAll
    List<Member> members = appCtx.getBean(MemberDao.class).findAll();
    for (Member m : members) {
      System.out.println(m);
    }
    
  }

}
