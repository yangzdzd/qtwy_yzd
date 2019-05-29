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

table th,td{
	text-align: center;
}
</style>
</head>
<body>
	<input type="hidden" name="">
	<div id="tableAll">
		<table class="table table-hover table-bordered" border="1">
			<tr class="info">
				<td colspan="10" align="center"><h3>职位投递记录</h3></td>
			</tr>
			<tr>
				<th>企业名称</th>
				<th>职位名称</th>
				<th>工作地址</th>
				<th>薪资</th>
				<th>职位发布时间</th>
			<!-- 	<td>操作</td> -->
			</tr>
			<c:forEach items="${applyList_}" var="apply_">
				<tr class="table table-hover">
					<td>${apply_.companyName}</td>

					<td>${apply_.jobName }</td>

					<td>${apply_.jobAddress }</td>

					<td>${apply_.jobSalary}</td>

					<td><fmt:formatDate value="${apply_.releaseTime}"
									pattern="yyyy-MM-dd" /></td>
					<%-- <td>
					<a
						href="${pageContext.request.contextPath }/apply/deleteById?sid=${apply.sid }"
						class="btn btn-default" id="del">删除</a></td> --%>
					</tr>
			</c:forEach>
		</table>
	</div>
</body>

</html>