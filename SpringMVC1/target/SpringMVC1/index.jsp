<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="js/jquery.min.js"></script>
<title>首页</title>
<link href="css/success.css">
<body>
<h2>成功登入首页</h2>
<a href="/Acc/add?name=zs&age=18">添加</a>
<form action="/Acc/update" method="post">
    账号名称:<input name="name" type="text" ><br/>
    年龄:<input name="age" type="text" ><br/>
    金额:<input name="money" type="text" > <br/>
    账号省份:<input name="addess.provinceName" type="text" >
    账户城市:<input name="addess.cityName" type="text" >
    <input type="submit" value="更新">
</form>
<h1>-----------------------------------------------------------------------------------------------</h1>
<form action="/Acc/addupdate" method="post">
    账号：<input type="text" name="username">
    密码:<input type="password" name="password">
        <input type="submit" value="提交更新">
</form>
<h1>------------------------------------------------------------------------------------------------</h1>
<a href="/Acc/pathvariable/1">测试@PathVarliable</a>
</body>
<h1>--------------------------------------------------------------------------------------------------</h1>
<a href="/Acc/head">获取到当前页面中的请求头</a>
<h1>----------------------------------------------------------------------------------------------------</h1>
<a href="/Acc/cookies">获取当前页面中的Cookies</a>
<h1 >---------------------------------------------------------------------------------------------------</h1>
<a href="/Acc/redict">重定向</a>
<h1 >---------------------------------------------------------------------------------------------------</h1>
<a href="/Acc/forwar">请求转发</a>
<h1 >---------------------------------------------------------------------------------------------------</h1>
<a href="/Acc/redirectText">现在的是重定向到外网中</a>
<h1>-----------------------------------------</h1>
<a href="/Acc/redirectText1">现在是重定向到方法中</a>
<h1>----------------------------------------------</h1>
<a href="/Acc/json">响应到Json中</a>
</html>

