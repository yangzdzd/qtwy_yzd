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
table td input {
	width: 400px;
	height: 35px;
	background-color: #ffdab9;
	padding-left: 15px;
	margin-left: 5px
}
#resume{	
	float:right;
	font-size: large;
}

#divTable {
	height: 79%;
	margin-left: 150px;
	margin-right: 100px;
}
#name{
	font-size:medium;
	padding-top:20px;
	padding-left:60px;
}
body {
	background-color: #fffafa
}
</style>
<script type="text/javascript">
	 function saveResume(){
		var email=document.getElementById("email").value;
		if(email.length==0){
			alert("邮箱不能为空");
			return false;
		}else{ 
			var pattern = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
			if(!pattern.test(document.getElementById("email").value))
			{
				alert('\n请输入正确的邮箱格式!');
				return false;
			}
		}
		$("#submitForm").submit();
	}
</script>
</head>
<body>
	
	<form action="${path}/user/saveResume" method="post" id="submitForm">
		<input type="hidden" name="uid" value="${user.uid}">
		<input type="hidden" name="loginName" value="${user.loginName }" />
		<input type="hidden" name="loginPwd" value="${user.loginPwd }" />
		<input type="hidden" name="realname" value="${user.realname }" />
	<div id="divTable">
		<table class="table table-hover table-bordered">
			<tr>
				<td colspan="3" align="center" style="padding-right: 110px;background-color:#f0ffff;">
					<h3>个人简历</h3> 
					<a href="javascript:void(0)" onclick="saveResume()" id="resume">保存简历</a>
				</td>
			</tr>
			<tr>
				<td style="text-align:right;"><img src="${path}/images/man.png" width="50" height="50"></td>
				<td id="name">真实名字</td>
				<td id="name">${user.realname}</td>
			</tr>
			<tr>
				<td style="text-align:right;">
				<img src="${path}/images/y1.png" width="50" height="50"></td>
				<td id="name">工作状态</td>
				<td><input type="text" name="jobStatus" value="${user.jobStatus}"></td>
			</tr>
			<tr>
				<td style="text-align:right;">
				<img src="${path}/images/y2.png" width="50" height="50"></td>
				<td id="name">电话</td>
				<td><input type="text" name="telephone" value="${user.telephone}"></td>
			</tr>
			<tr>
				<td style="text-align:right;">
					<img  src="${path}/images/y3.png" width="50" height="50"></td>
					<td id="name">邮箱</td>
					<td><input type="text" name="email" id="email" value="${user.email}"></td>
			</tr>
			<tr>
				<td style="text-align:right;">
				<img src="${path}/images/y4.png" width="50" height="50"></td>
				<td id="name">性别</td>
				<td><input type="text" name="gender" value="${user.gender}"></td>
			</tr>
	
			<tr>
				<td style="text-align:right;"><img src="${path}/images/y5.png" width="50" height="50"></td>
				<td id="name">地址 </td>
				<td><input type="text" name="address" value="${user.address}"></td>
			</tr>
			<tr>
				<td style="text-align:right;"><img src="${path}/images/y7.png" width="50" height="50"></td>
				<td id="name">个人描述</td>
				<td><input type="text" name="descripte" value="${user.descripte}"></td>
			</tr>
			<tr>
				<td style="text-align:right;"><img src="${path}/images/y6.png" width="50" height="50"></td>
				<td id="name">期望薪资</td>
				<td><input type="text" name="salary" value="${user.salary}">元/月 </td>
			</tr>
			<tr>
				<td style="text-align:right;"><img src="${path}/images/y8.png" width="50" height="50"></td>
				<td id="name">毕业学校</td>
				<td><input type="text" name="school" value="${user.school}"> </td>
			</tr>
		</table>
		</div>
		</form>
</body>
</html>