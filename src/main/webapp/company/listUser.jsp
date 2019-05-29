<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>
<style type="text/css">
 #tableAll {
	margin-top: 30px;
	margin-left: 40px;
	margin-right: 40px;
}

table td {
	text-align: center;
}
</style>
</head>
<body>
	<input type="hidden" value="${user.uid}" />
	<div id="tableAll">
		<table class="table  table-hover table-bordered">
			<tr class="info">
				<td colspan="10" align="center"><h3>求职者详细信息</h3></td>
			</tr>
			<tr class="success" height="40px;" style="padding-top: '10px;'">
				<td>真实姓名</td>
				<td>性别</td>
				<td>电话</td>
				<td>邮箱</td>
				<td>描述</td>
				<td>地址</td>
				<td>工作状态</td>
				<td>期望工资</td>
				<td>毕业学校</td>
			</tr>
				<tr>
					<td>${user.realname}</td>

					<td>${user.gender }</td>

					<td>${user.telephone }</td>

					<td>${user.email }</td>

					<td>${user.descripte }</td>

					<td>${user.address }</td>

					<td>${user.jobStatus}</td>

					<td>${user.salary}</td>

					<td>${user.school}</td>
				</tr>
		</table>
	</div>
</body>

</html>