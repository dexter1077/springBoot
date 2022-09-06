<%--
  Created by IntelliJ IDEA.
  User: zesinc
  Date: 2022-08-30
  Time: 오전 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>타이틀</title>
    <style>
        #container{width: 1200px; height:800px;}
        #mainTitle{ margin: auto; font-size: 28px; }
    </style>
</head>
<body>
<div id="container">
    <div id="mainTitle">This Page made by JSP</div>

    <form>
        <input type="text" name="userId">
        <input type="password" name="userPwd">

        <button type="submit">로그인</button>
    </form>

    <a href="user/registPage.do"> 회원가입</a>
</div>


</body>
</html>
