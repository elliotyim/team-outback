<%@ page import="com.practice.kyb.practice2.domain.Member" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Member member = (Member)request.getAttribute("loginUser"); %>
<%= member.getName() %>님 환영합니다!<br>
</body>
</html>