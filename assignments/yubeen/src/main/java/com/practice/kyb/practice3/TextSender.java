package com.practice.kyb.practice3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TextSender {
  @RequestMapping("/send")
  public String send(String contents) {
    System.out.println("입력한 값: " + contents);
    return "/WEB-INF/jsp/text_received.jsp";
  }
}
