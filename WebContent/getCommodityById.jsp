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
	<h1>商品信息录入</h1>
	<form action="getCommodityById">
	<table>
	<tr>
		<td width="20%"><input type="text" class="form-control" required="required"
			style="width: 200px;" name="commodityId" placeholder="请输入产品编号  查询..." />
			</td>
			<td style="width: 70%">
		<hr />
		</td>
		<td>
			<button type="submit" class="btn btn-default"
				style="width: 100px; color: white; background: #215fa0;">
				查询</button>
				</td>
	</tr>
	</table>
	</form>
	<s:if test="#request.commodity!=null">
		<table>
			<thead>
				<tr style="width: auto;">
					<th style="width: 30%">商品编号</th>
					<th style="width: 30%">商品名称</th>
					<th style="width: 30%">商品价格(元)</th>
					<th style="width: 200px">商品折扣(%)</th>
				</tr>

			</thead>
			<tbody>
				<tr>
					<td colspan="4"><hr /></td>
				</tr>
				<tr>
					<td style="width: 30%"><s:property
							value="#request.commodity.commodityId" /></td>
					<td style="width: 30%"><s:property
							value="#request.commodity.commodityName" /></td>
					<td style="width: 30%"><s:property value="#request.commodity.price" />
					</td>
					<td style="width: 40%"><s:property value="#request.commodity.agio" />
					</td>
				</tr>
			</tbody>
		</table>
	</s:if>
</body>
<script type="text/javascript">
	var msg = "${requestScope.tipMessage}";
	if (msg != "") {
		alert(msg);
	}
</script>
</html>