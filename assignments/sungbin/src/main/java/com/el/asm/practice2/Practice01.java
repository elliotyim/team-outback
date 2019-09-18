package com.el.asm.practice2;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.el.asm.practice2.domain.Member;


public class Practice01 {

  public static void main(String[] args) throws Exception {

    // Mybatis를 사용하여 SqlSession 객체를 생성
    String resource = "com/el/asm/conf/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();

    // FindAll
    List<Member> memberList = sqlSession.selectList("ohora.findAll");
    for (Member m : memberList) {
      System.out.println(m);
    }

  }
}
