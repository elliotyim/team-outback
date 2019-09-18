package com.practice.kyb;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class Calculator {

  @RequestMapping("add")
  public int add(int a, int b) {
    return a + b;
  }
  
  @RequestMapping("sub")
  public int sub(int a, int b) {
    return a - b;
  }
  
  @RequestMapping("mul")
  public int mul(int a, int b) {
    return a * b;
  }
  
  @RequestMapping("div")
  public int div(int a, int b) {
    return a / b;
  }
  
}
