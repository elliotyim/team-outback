package com.practice.kyb.practice3.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.practice.kyb.practice2.dao.MemberDao;
import com.practice.kyb.practice2.domain.Member;

@Controller
public class LoginController {
  @Autowired
  MemberDao memberDao;

  @RequestMapping(value="/login", method=RequestMethod.POST)
  public String login(
      HttpServletRequest request,
      String email,
      String password) throws Exception {
    Map<String,Object> params = new HashMap<>();
    params.put("email", email);
    params.put("password", password);

    Member member = memberDao.findByEmailPassword(params);

    if (member == null) {
      return "/WEB-INF/jsp/error.jsp";
    }

    request.setAttribute("loginUser", member);
    return "/WEB-INF/jsp/login.jsp";
  }

}
