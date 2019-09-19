<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="user/uploadfile" method="post" enctype="multipart/form-data">
<input type="text" name="uname"><br/>
选择文件：<input type="file" name="upload" /><br/>
<input type="submit" value="上传" /><br/>

</form>
</body>
</html>