<%--
  Created by IntelliJ IDEA.
  User: chenyuchao
  Date: 2016/6/18
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>abc</title>
  </head>
  <body>
  <h1>${helloworld}</h1>
  <form action="./hello.do" method="post">
    hello:<input type="text" name ="userName"/>
    <input type="submit" value="提交"/>
  </form>
  </body>
</html>
