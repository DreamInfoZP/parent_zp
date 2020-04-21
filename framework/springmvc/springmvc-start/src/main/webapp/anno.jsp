<%--
  Created by IntelliJ IDEA.
  User: DREAM
  Date: 2020/04/21
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="anno/testRequestParam?name=dsdsa">RequestParam</a>

<form action="anno/testRequestBody" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    <input type="submit">
</form>

<a href="anno/testPathVariable/10">testPathVariable</a><br>

<a href="anno/testRequestHeader">testRequestHeader</a><br>

<a href="anno/testCookieValue">testCookieValue</a>

</body>
</html>
