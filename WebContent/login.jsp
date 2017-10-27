<%@page import="com.jkxy.model.User"%>
<%@page import="java.util.Map"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
<title>管理系统登录</title>
</head>
<body>
	<div class="container">
		<div
			class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2"
			id="logindev">
			<h3 class="text-center" style="color: #b72116;">商品VIP消费情况查询系统</h3>
			<br> <br>
			<h3 class="text-center" style="font-weight: bold;">Please Sign
				in</h3>
			<form class="form-horizontal" role="form" action="checkUser">
				<div class="form-group">
					<div class="col-sm-10">
						<div class="center-block">
							<input type="text" class="form-control" name="user.username"
								style="width: 350px;" placeholder="username"
								/>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-10">
						<input type="password" class="form-control" name="user.password"
							style="width: 350px;" placeholder="password"
							/>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-10">
						<div class="checkbox">
							<label><input type="checkbox" name="rememberme"/>Remember me</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class=" col-sm-10">
						<button type="submit" class="btn btn-default"
							style="width: 350px; color: white; background: #215fa0;">Sign
							in</button>
							<h4 style="color:red;"><b><s:property value="%{#request.msg}"/></b></h4>
					</div>
				</div>
				<input type="hidden" name="user.quanxian" value="0">
			</form>

			<table class="form-horizontal">
				<thead>
					<tr>
						<th></th>
						<th>用户名</th>
						<th>密码</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>老板</td>
						<td>boss</td>
						<td>boss</td>
					</tr>
					<tr>
						<td>管理员</td>
						<td>admin</td>
						<td>admin</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>