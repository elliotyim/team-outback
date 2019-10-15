package com.el.asm.practice3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TextSender {

  @RequestMapping("/send")
  public String send(String content) {
    System.out.println("입력한 값: " + content);
    return "/WEB-INF/jsp/text_received.jsp";
  }
}
