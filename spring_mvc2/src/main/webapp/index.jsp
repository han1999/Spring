<%--
  Created by IntelliJ IDEA.
  User: hx
  Date: 2022/5/5
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello!<br>
<form action="file/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br>
    <input type="text" name="username"><br>
    <input type="submit">
</form>
<hr>
<label>多个文件</label><br>

<form action="file/list/upload" method="post" enctype="multipart/form-data">
    <input type="file"  multiple name="files"><br>
    <input type="text" name="username"><br>
    <input type="submit"><br>
</form>
</body>
</html>
