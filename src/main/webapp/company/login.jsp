<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>企业登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>
<style type="text/css">
table td input {
	width: 500px;
	height: 35px;
	background-color: #fff8dc;
	padding-left: 10px;
	margin-left: 20px;
	margin-top: 15px;
}

#tdLeft {
	text-align: right;
}

table {
	margin: 0 auto;
	margin-top: 110px;
}

#submitBtn {
	width: 100px;
	height: 40px;
}

body {
	background-color: #f5fffa
}

.login-footer {
	height: 115px;
	line-height: 115px;
	color: #a1a1a1;
	font-size: 14px;
	text-align: center;
}
</style>
<script type="text/javascript">
	function CheckForm(){
		var companyLoginName=document.getElementById("companyLoginName").value;
		var companyPwd=document.getElementById("companyPwd").value;
		if(companyLoginName.length==0){
			alert("请输入登录名");
			return false;
		}else
		{
			var pattern = /^[0-9a-zA-Z]+$/;
			if(!pattern.test(document.getElementById("companyLoginName").value))
			{
				alert('\n用户名只可输入数字或者字母!');
				return false;
			}
		}
		if(companyPwd.length==0){
			alert("请输入密码");
			return false;
		}
		$.ajax({
			url:"${pageContext.request.contextPath}/com/accessComLogin",
			data:{
				companyLoginName:companyLoginName,
				companyPwd:companyPwd
			},//给服务器的参数
			type:"POST",
			dataType:"json",
			success:function(data){
				if("success"==data.str){
					alert("登录成功");
					var url="${pageContext.request.contextPath}/com/index";
					window.location.href=url; 
				}else{
					alert("登录失败,请输入正确的用户名和密码");
					var url="${pageContext.request.contextPath}/com/login";
					window.location.href=url; 
				}
			}
		});
	}
</script>

</head>
<body>
		<table>
			<tr>
				<td colspan="2" align="center"><h3>企业登录</h3></td>
			</tr>
			<tr>
				<td id="tdLeft">用户名:</td>
				<td><input type="text" id="companyLoginName" name="companyLoginName"
					placeholder="请输入用户名" /></td>
			</tr>
			<tr>
				<td id="tdLeft">密码:</td>
				<td><input type="password" id="companyPwd" name="companyPwd"
					placeholder="请输入密码" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="button" value="登录"
					id="submitBtn" onclick="CheckForm()"/></td>
			</tr>
		</table>
	<div class="login-footer">
		<div class="wrapper">版权所有 © qtwy 保留一切权利。</div>
	</div>
</body>
</html>