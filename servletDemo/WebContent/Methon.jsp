<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
  <form action="methond" method="get">
              用户名：<input type="text" name="uname" value=""/> <br/>
              密码：<input type="text" name="pwd" value=""/> <br/>
              <input type="submit" value="登陆"/>
  </form>
  <%
      // java 代码域
      int a = 5;
  	  if(a > 3){
  %>
  <b> JSP so easy !!</b>
  <% } %>
</body>
</html>

<%--
  JSP注释 不会转译
     使用局部代码块在jsp中进行逻辑判断可阅读体验比较差，书写麻烦
     开发：
     servlet 处理逻辑
     jsp 进行页面展示
 --%>