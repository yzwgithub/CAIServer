<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2017/7/15
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>First page</title>
  </head>
  <body>
<div align="center">
  <form action="/jsp/jsp01.jsp" method="get">
    用户名：<input type="text" name="account"><br>
    密  码：<input type="text" name="password"><br>
    <input type="submit" value="提交">
  </form>
</div>
  <% int a=1;
  System.out.println(a);
  %>
  </body>
</html>
