package com.practice2;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.practice2.domain.Member;

public class Practice01 {
  public static void main(String[] args) throws Exception {
    String resource = "com/conf/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    List<Member> memberList = sqlSession.selectList("woohyuk.list");
    for (Member m : memberList) {
      System.out.println(m);
    }
  }
}
