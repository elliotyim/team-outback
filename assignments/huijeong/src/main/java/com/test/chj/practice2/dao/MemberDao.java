package com.test.chj.practice2.dao;

import java.util.List;
import java.util.Map;
import com.test.chj.practice2.domain.Member;

public interface MemberDao {

  int insert(Member member) throws Exception;
  List<Member> findAll() throws Exception;
  Member findBy(int no) throws Exception;
  List<Member> findByKeyword(String keyword) throws Exception;
  int update(Member member) throws Exception;
  int delete(int no) throws Exception;
  Member findByEmailPassword(Map<String,Object> params) throws Exception;
}
