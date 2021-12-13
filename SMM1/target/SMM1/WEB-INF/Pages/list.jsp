<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021/11/20
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 在往jsp传递数据的时候一定要使用这个不然会显示为简单的字符串--%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>列表页</title>
</head>
<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>money</td>
    </tr>
    <c:forEach items="${list}" var="accone">
        <tr>
            <td>${accone.id}</td>
            <td>${accone.name}</td>
            <td>${accone.money}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
