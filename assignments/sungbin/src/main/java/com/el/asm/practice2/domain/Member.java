package com.el.asm.practice2.domain;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Member implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private int no;
  private String name;
  private String email;
  private String password;
  private String tel;
  private String photo;
  private Date registeredDate;
  
  public int getNo() {
    return no;
  }
  public Member setNo(int no) {
    this.no = no;
    return this;
  }
  public String getName() {
    return name;
  }
  public Member setName(String name) {
    this.name = name;
    return this;
  }
  public String getEmail() {
    return email;
  }
  public Member setEmail(String email) {
    this.email = email;
    return this;
  }
  public String getPassword() {
    return password;
  }
  public Member setPassword(String password) {
    this.password = password;
    return this;
  }
  public String getTel() {
    return tel;
  }
  public Member setTel(String tel) {
    this.tel = tel;
    return this;
  }
  public String getPhoto() {
    return photo;
  }
  public Member setPhoto(String photo) {
    this.photo = photo;
    return this;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public Member setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
    return this;
  }
  @Override
  public String toString() {
    return "Member [no=" + no + ", name=" + name + ", email=" + email + ", password=" + password + ", tel=" + tel
        + ", photo=" + photo + ", registeredDate=" + registeredDate + "]";
  }
  
}
