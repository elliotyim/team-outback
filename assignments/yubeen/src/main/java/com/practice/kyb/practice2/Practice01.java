package com.practice.kyb.practice2;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.practice.kyb.practice2.domain.Member;

public class Practice01 {

  public static void main(String[] args) throws Exception {

    String resource = "com/practice/kyb/conf/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // Mybatis를 사용하여 직접 SqlSession으로 sql문을 실행할 때는
    // [namespace.id]의 형태로 직접 namespace를 지정해서 매핑된 SQL문을 실행할 수 있다.
    List<Member> memberList = sqlSession.selectList("ohora.findAll");
    for (Member m : memberList) {
      System.out.println(m);
    }
  }
}
