<%--
  Created by IntelliJ IDEA.
  User: 15420
  Date: 2021/11/14
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--引入jstl标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<h1 align="center" style="font-size: 30px">员工列表</h1>


<table align="center" border="1px">

    <tr>
        <th>用户电话</th>
        <th>用户姓名</th>
        <th>用户密码</th>
        <th>用户邮箱</th>
    </tr>

    <c:forEach items="${userList}" var="user">

        <tr>

            <td>${user.phoneNumber}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.mailAddress}</td>
        </tr>

    </c:forEach>


</table>
</body>
</html>
