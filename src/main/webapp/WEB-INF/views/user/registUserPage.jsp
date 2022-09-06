<%--
  Created by IntelliJ IDEA.
  User: zesinc
  Date: 2022-09-01
  Time: 오후 4:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
    <h1>회원가입</h1>
    <form action="/user/insertUser.do" method="post">
        <input type="hidden" name="userNo" value="4">
        <label>ID</label>
        <input type="text" name="userId">
        <label>userPwd</label>
        <input type="password" name="userPwd">
        <label>username</label>
        <input type="text" name="username">
        <button type="submit">회원가입</button>
    </form>
</body>
</html>
