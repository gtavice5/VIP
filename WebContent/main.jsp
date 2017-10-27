<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
<title>信息管理系统主界面</title>
</head>
<body >
<div class="container">
	<div class="row clearfix" style="background-color: black;color: white;font-size:large;">
		<div class="col-md-12 column">
			<strong>商场VIP消费情况查询系统</strong>
			<ul class="breadcrumb" style="display: inline;float: right;background-color: black;color: white;">
				<li>
					 <s:property value="#session.user.username"/>
				</li>
				<li>
					 <a href="help.jsp">关于</a>
				</li>
				<li>
					 <a href="help.jsp">帮助</a>
				</li>
				<li class="active">
					<a href="logOut.action" target="_top">退出</a>
				</li>
			</ul>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-2 column">
			<div class="panel panel-default">
				<div class="panel-heading">
					<a href="addCommodity.jsp" target="main">商品信息录入</a>
				</div>
				<div class="panel-heading">
					<a href="getCommodityById.jsp" target="main">商品信息查询</a>
				</div>
				<div class="panel-body">
					
				</div>
				<div class="panel-body">
					<a href="addVip.jsp" target="main">VIP信息添加</a>
				</div>
				<div class="panel-body">
					<a href="addConsume.jsp" target="main">VIP购物登记</a>
				</div>
				<div class="panel-body">
					<a href="browseConsumePaging" target="main">VIP购物查询</a>
				</div>
				<div class="panel-body">
					<a href="getVipById.jsp" target="main">VIP信息查询</a>
				</div>
				<div class="panel-body">
					
				</div>
				<div class="panel-footer">
				<s:if test="#session.quanxian==1">
					<a href="systemM.jsp" target="main">系统维护</a>
				</s:if>
				</div>
				<div class="panel-footer">
					<a href="help.jsp" target="main">帮助</a>
				</div>
			</div>
		</div>
		<div class="col-md-10 column">
				<iframe frameborder="0" name="main" src="center.jsp" height="500px" width="100%"></iframe>
		</div>
	</div>
</div>
</body>
</html>