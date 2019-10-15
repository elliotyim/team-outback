package com.practice1.domain;

import java.sql.Date;
import org.springframework.stereotype.Component;

@Component
public class Student {

  int no;
  String name;
  String email;
  Date registeredDate;
  
  @Override
  public String toString() {
    return "Student [no=" + no + ", name=" + name + ", email=" + email + ", registeredDate="
        + registeredDate + "]";
  }
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
  
}
