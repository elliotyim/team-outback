package com.practice.kyb.practice2.dao;

import java.util.List;
import com.practice.kyb.practice2.domain.Member;

public interface MemberDao {
  
  int insert(Member member) throws Exception;
  List<Member> findAll() throws Exception;
  Member findBy(int no) throws Exception;
  int update(Member member) throws Exception;
  int delete(int no) throws Exception;

}
