<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: #b72116;">欢迎进入本系统!</h1>
	<h1>系统维护</h1>
	<div class="container">
		<div>
		<form action="userAction" method="post">
		<h3><strong>请输入用户名:</strong></h3>
		<input type="text" name="username" class="form-control" style="width: 200px;" placeholder="请输入用户名:">
			<button type="submit" class="btn btn-default"
				style="width: 200px;margin-top:10px; color: white; background: #215fa0;"
				onclick="this.form.action='grantUser'">授予登录权限</button>
				<br>
							<button type="submit" class="btn btn-default"
				style="width: 200px;margin-top:10px; color: white; background: #215fa0;"
				onclick="this.form.action='removeUser'">解除登录权限</button>
		</form>
		</div>
	</div>
</body>
<script type="text/javascript">
	var msg = "${requestScope.tipMessage}";
	if (msg != "") {
		alert(msg);
	}
</script>
</html>