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
	<h1>VIP购物登记</h1>
	<div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<table class="table">
					<thead>
						<tr>
							<th>消费ID</th>
							<th>VIP编号</th>
							<th>姓名</th>
							<th>商品编号</th>
							<th>商品名称</th>
							<th>商品价格</th>
							<th>实收金额</th>
						</tr>
					</thead>

					<tbody>
						<s:iterator value="#request.consumes" id="consume">
							<tr class="success">
								<td><s:property value="#consume.consumeId" /></td>
								<td><s:property value="#consume.vip.vipId" /></td>
								<td><s:property value="#consume.name" /></td>
								<td><s:property value="#consume.commodity.commodityId" /></td>
								<td><s:property value="#consume.commodityName" /></td>
								<td><s:property value="#consume.price" /></td>
								<td><s:property value="#consume.practicePrice" /></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
				<s:set name="pager" value="#request.page" />
				<ul class="pagination">
					<li><s:if test="#pager.hasFirst">
							<a href="browseConsumePaging.action?currentPage=1">首页</a>
						</s:if></li>
					<li><s:if test="#pager.hasPrevious">
							<a
								href="browseConsumePaging.action?currentPage=
							<s:property value="#pager.currentPage-1"/>">上一页</a>

						</s:if></li>
					<li><s:if test="#pager.hasLast">
							<a
								href="browseConsumePaging.action?currentPage=
							<s:property value="#pager.totalPage"/>">尾页</a>
						</s:if></li>
					<li><s:if test="#pager.hasNext">
							<a
								href="browseConsumePaging.action?currentPage=
							<s:property value="#pager.currentPage+1"/>">下一页</a>
						</s:if></li>
				</ul>
				<br> 当前第
				<s:property value="#pager.currentPage" />
				页，总共
				<s:property value="#pager.totalPage" />
				页，总记录数
				<s:property value="#pager.totalSize" />
				条
			</div>
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