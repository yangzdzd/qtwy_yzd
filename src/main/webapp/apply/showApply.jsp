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
	margin-right: 20px;
}

table td {
	text-align: center;
}
</style>
<script type="text/javascript">
	function showUserDetail(realname){
		var url="${path}/user/findUserByRealname?realname="+realname;
		window.location.href=url;
	}
</script>
</head>
<body>
	<div id="tableAll">
		<table class="table table-hover table-bordered" border="1">
			<tr class="info">
				<td colspan="10" align="center"><h3>企业信箱</h3></td>
			</tr>
			<tr>
				<td>应聘者姓名</td>
				<td>应聘职位</td>
				<td>职位地址</td>
				<td>职位工资</td>
				<td>职位发布时间</td>
			</tr>
			<c:forEach items="${applyList}" var="apply">
				<tr class="table table-hover">
					<td><a onclick="showUserDetail('${apply.realname}')">${apply.realname}</a></td>

					<td>${apply.jobName }</td>

					<td>${apply.jobAddress }</td>

					<td>${apply.jobSalary}</td>

					<td><fmt:formatDate value="${apply.releaseTime}"
									pattern="yyyy-MM-dd" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>

</html>