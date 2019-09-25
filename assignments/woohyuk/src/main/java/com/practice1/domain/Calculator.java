package com.practice1.domain;

import java.util.Scanner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class Calculator {
  Scanner scan = new Scanner(System.in);

  @RequestMapping("add")
  public void add() {

    System.out.println("덧셈");
    System.out.print("값1 : ");
    int a = scan.nextInt();
    System.out.print("값2 : ");
    int b = scan.nextInt();
    
    System.out.printf("%d + %d = %d", a, b, a+b);
  }
  
  @RequestMapping("sub")
  public void sub() {
    
    System.out.println("뺄셈");
    System.out.print("값1 : ");
    int a = scan.nextInt();
    System.out.print("값2 : ");
    int b = scan.nextInt();
    
    System.out.printf("%d - %d = %d", a, b, a-b);
  }
  
  @RequestMapping("mul")
  public void mul() {
    
    System.out.println("곱셈");
    System.out.print("값1 : ");
    int a = scan.nextInt();
    System.out.print("값2 : ");
    int b = scan.nextInt();
    
    System.out.printf("%d * %d = %d", a, b, a*b);
  }
  
  @RequestMapping("div")
  public void div() {
    
    System.out.println("나누기");
    System.out.print("값1 : ");
    int a = scan.nextInt();
    System.out.print("값2 : ");
    int b = scan.nextInt();
    
    System.out.printf("%d / %d = %d", a, b, a/b);
  }

}
