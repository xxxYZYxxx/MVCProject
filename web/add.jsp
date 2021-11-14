<%--
  Created by IntelliJ IDEA.
  User: 15420
  Date: 2021/11/14
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<html>
<head>
    <title>注册</title>

    <script language="JavaScript">
        function success(){
            window.alert("注册成功！");
        }
    </script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/addUser" method="post">
        手机号：<input type="text" name="phoneNumber">
        <br>
        用户名：<input type="text" name="username">
        <br>
        密码：<input type="password" name="password">
        <br>
        邮箱：<input type="text" name="mailAddress">
        <br>
        <input type="submit" value="注册" onclick="success()">
    </form>
</body>
</html>
