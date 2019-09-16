package com.el.asm.practice1.domain;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Student {
  int no;
  String name;
  String email;
  Date registeredDate;
  
  public int getNo() {
    return no;
  }
  public Student setNo(int no) {
    this.no = no;
    return this;
  }
  public String getName() {
    return name;
  }
  public Student setName(String name) {
    this.name = name;
    return this;
  }
  public String getEmail() {
    return email;
  }
  public Student setEmail(String email) {
    this.email = email;
    return this;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public Student setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
    return this;
  }
  
  @Override
  public String toString() {
    return "Student [no=" + no + ", name=" + name + ", email=" + email + ", registeredDate=" + registeredDate + "]";
  }
  
}
