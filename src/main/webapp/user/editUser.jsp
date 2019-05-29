<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>
<style type="text/css">
table td input {
	width: 500px;
	height: 35px;
	background-color: pink;
	padding-left: 10px;
	margin-left: 20px
}

#tdLeft {
	text-align: right;
	padding-top: 15px;
}

#saveBtn {
	background-color: #fffacd;
	width: 120px;
	margin-right: 140px;
}

#divTable {
	height: 100%;
	margin-left: 90px;
	padding-left: 140px;
	margin-right: 50px;
}

body {
	background-color: #fff8dc
}
</style>
</head>
<body>
	<form id="userForm"
		action="${pageContext.request.contextPath }/user/editUserSubmit"
		method="post">
		<input type="hidden" name="uid" value="${user.uid }" />
		<input type="hidden" name="realname" value="${user.realname }" />
		<input type="hidden" name="loginPwd" value="${user.loginPwd }" />
		<div id="divTable">
			<table class="table table-hover">
				<tr>
					<td colspan="2" align="center" style="padding-right: 120px"><h3>修改个人信息</h3></td>
				</tr>
				<tr>
					<td id="tdLeft">登录名:</td>
					<td><input type="text" name="loginName"
						value="${user.loginName}" /></td>
				</tr>
				<tr>
					<td id="tdLeft">性别:</td>
					<td><input type="text" name="gender" value="${user.gender }" /></td>
				</tr>
				<tr>
					<td id="tdLeft">电话:</td>
					<td><input type="text" name="telephone"
						value="${user.telephone }" /></td>
				</tr>
				<tr>
					<td id="tdLeft">邮箱:</td>
					<td><input type="text" name="email" value="${user.email }" /></td>
				</tr>

				<tr>
					<td id="tdLeft">描述:</td>
					<td><input type="text" name="descripte"
						value="${user.descripte }" /></td>
				</tr>
				<tr>
					<td id="tdLeft">地址:</td>
					<td><input type="text" name="address" value="${user.address }" /></td>
				</tr>
				<tr>
					<td id="tdLeft">工作状态</td>
					<td><input type="text" name="jobStatus"
						value="${user.jobStatus}" /></td>
				</tr>
				<tr>
					<td id="tdLeft">期望工资:</td>
					<td><input type="text" name="salary" value="${user.salary}" /></td>
				</tr>
				<tr>
					<td id="tdLeft">毕业学校:</td>
					<td><input type="text" name="school" value="${user.school}" /></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><input type="submit" value="保存"
						id="saveBtn" class="btn btn-default" /></td>
				</tr>
			</table>
		</div>
	</form>
</body>

</html>