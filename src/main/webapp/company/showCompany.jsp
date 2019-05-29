<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改企业信息</title>
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>
</head>
<body>
	<form id="companyForm"
		action="${pageContext.request.contextPath }/company/saveOrUpdate.do"
		method="post">
		<table class="table table-striped table-hover">
			<tbody class="table-responsive">
				<tr class="info">
					<td>企业名称</td>
					<td>企业类型</td>
					<td>登录名</td>
					<td>企业地址</td>
					<td>企业网址</td>
					<td>企业描述</td>
					<td>员工人数</td>
					<td>操作</td>
				</tr>
			</tbody>
			<tr>
				<td><input type="text" name="companyName"
					value="${company.companyName}" /></td>

				<td><input type="text" name="companyType"
					value="${company.companyType }" /></td>

				<td><input type="text" name="companyLoginName"
					value="${company.companyLoginName }" /></td>

				<td><input type="text" name="companyAddress"
					value="${company.companyAddress }" /></td>

				<td><input type="text" name="companyWebsite"
					value="${company.companyWebsite}" /></td>

				<td><input type="text" name="companyDesc"
					value="${company.companyDesc }" /></td>

				<td><input type="text" name="empNum" value="${company.empNum}" /></td>

				<td><a
					href="${pageContext.request.contextPath}/com/editCompany.do?id=${company.uid}">修改</a>
				</td>
			</tr>
		</table>
	</form>
</body>

</html>