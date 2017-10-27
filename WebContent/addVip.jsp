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
  <link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
  <script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
  <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
  <link rel="stylesheet" href="jqueryui/style.css">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: #b72116;">欢迎进入本系统!</h1>
	<h1>VIP信息添加</h1>
	<hr />
	<form action="addVip">
		<table>
			<thead>
				<tr>
					<th style="width: 11px;">VIP编号</th>
					<th style="width: 11%">姓名</th>
					<th style="width: 11%">年龄</th>
					<th style="width: 11%">成分</th>
					<th style="width: 22%">入会时间</th>
				</tr>

			</thead>
			<tbody>
				<tr>
					<td colspan="5"><hr /></td>
				</tr>
				<tr>
					<td style="width: 11%"><input type="text" class="form-control"
						readonly="readonly" style="width: auto;" placeholder="自动递增" /></td>
					<td style="width: 11%"><input type="text" class="form-control"
						required="required" style="width: auto;"
						name="vip.name" 
						id="name"/></td>
					<td style="width: 11%"><input type="number" class="form-control"
						required="required" style="width: auto;" name="vip.age" /></td>
					<td style="width: 11%"><input type="text" class="form-control"
						required="required" style="width: auto;" name="vip.profession" />
					</td>
					<td style="width: 22%"><input type="text" class="form-control"
						required="required" style="width: auto;" name="vip.joinTime"
						id="datepicker" onchange="onjoinTimeChange()"
						placeholder="请点击选择..."/>
					</td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5"><hr/></td>
				</tr>
				<tr>
				<td>
				</td>
				<td><button type="reset"
							class="btn btn-default"
							style="width: 100px; color: white; background: #215fa0;">
							重置</button></td>
							<td></td>
							<td colspan="2">
						<button type="submit" class="btn btn-default"
							style="width: 100px; color: white; background: #215fa0;">
							添加</button>
					</td>
				</tr>
			</tfoot>
		</table>
		<%-- <s:hidden name="vip.vipId" value="%{#vip.vipId}"></s:hidden> --%>
	</form>
</body>
<script type="text/javascript">
$("#name").focus();
$(function() {
    $( "#datepicker" ).datepicker();
  });
	  function onjoinTimeChange(){
		  $( "#datepicker" ).datepicker( "option", "dateFormat", "yy-mm-dd");
	  };
	var msg = "${requestScope.tipMessage}";
	if (msg != "") {
		alert(msg);
	}
</script>
</html>