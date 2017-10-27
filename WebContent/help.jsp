<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;◆ 登录</h4>
			<p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本系统为商场VIP消费情况查询系统，具有一定的保密性。因此必须要有一定的权限
				才能使用本系统查询。要进行查询就必须先登录才能使用本系统。登录之后进入系统的主 界面，在主界面可以选择用户想要执行的功能模块。</p>
			<h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;◆ 商品信息录入</h4>
			<p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;在维护本系统时，要不断更新系统的数据。其中商品的信息是在不断增加的，当新进
				商品时，要保证商品信息的同步更新。在本模块可将新进商品的信息录入保存在服务器的 数据库中。</p>
			<h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;◆ 商品信息查询</h4>
			<p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;有时候想了解某种商品的详细信息。在本模块可以查询所想知道的商品的详细信息。</p>
			<h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;◆ VIP信息管理</h4>
			<p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本系统为VIP消费查询系统，因此对VIP的信息管理是核心。本模块是进行VIP信息登
				记的模块。</p>
			<h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;◆ VIP购物登记</h4>
			<p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当VIP购物时，要对其所购物品进行登记，以便以后对其进行统计。</p>
			<h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;◆ VIP信息查询</h4>
			<p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;对VIP的信息查询是经常性的操作，在本模块可以查询指定VIP的详细信息，以了解某
				会员的购物情况。</p>
			<h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;◆系统维护</h4>
			<p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本系统并不是每个人都可以使用，在本模块可以授予某个使用者使用本系统的权利，
				同样也可以剥夺某个使用者使用本系统的权利。</p>
			<h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;◆ 帮助</h4>
			<p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;使用者可以在本模块学习怎么使用系统，以方便操作。</p>
		</div>
	</div>
</body>
</html>