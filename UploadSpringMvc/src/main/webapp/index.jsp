<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form enctype="multipart/form-data" method="post" action="/Upload">
    <input type="file" name="uploadfile"><br/>
    <input name="desc"> <br>
    <input type="submit" value="提交">

</form>
</body>
</html>
