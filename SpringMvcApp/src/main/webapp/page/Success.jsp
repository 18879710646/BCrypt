<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021/10/23
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<form action="/Mulit.do" method="post" enctype="multipart/form-data">
    上传图片：<input type="file" name="Multfile"><br/>
    取名：<input name="desc" type="text">
    <input type="submit" value="提交">
</form>
</body>
</html>
