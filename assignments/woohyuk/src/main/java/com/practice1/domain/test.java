package com.practice1.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class test {
  
  @RequestMapping("dd")
  public void dd() {
    System.out.println("dd");
  }

}
