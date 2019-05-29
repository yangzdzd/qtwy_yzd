<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
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
	function Check(){
		var loginName=document.getElementById("loginName").value;//用户登录名
		var loginPwd=document.getElementById("loginPwd").value;//密码
		var gender=document.getElementById("gender").value;//性别
		var telephone=document.getElementById("telephone").value;//电话
		var email=document.getElementById("email").value;//邮箱
		var descripte=document.getElementById("descripte").value;//描述
		var realname=document.getElementById("realname").value;//真实姓名
		var address=document.getElementById("address").value;//地址
		var jobStatus=document.getElementById("jobStatus").value;//工作状态
		var salary=document.getElementById("salary").value; //期望薪资
		var school=document.getElementById("school").value;//毕业学校
		if(loginName.length==0){
			alert("用户登录名为空");
			return false;
		}else{ 
			var pattern = /^[0-9a-zA-Z]+$/;
			if(!pattern.test(document.getElementById("loginName").value))
			{
				alert('\n用户名只可输入数字或者字母!');
				return false;
			}
		}
		if(realname.length==0){
			alert("真实姓名为空");
			return false;
		}
		$.ajax({
			url:"${path}/user/registUser",
			data:{
				loginName:loginName,//用户登录名
				loginPwd:loginPwd,//密码
				gender:gender, //性别
				telephone:telephone, //电话
				email:email,//邮箱
				descripte:descripte,//描述
				realname:realname,//真实姓名
				address:address,//地址
				jobStatus:jobStatus,//工作状态
				salary:salary,//期望薪资
				school:school//毕业学校
			},
			type:"POST",
			dataType:"json",
			success:function(data){
				if("success"==data.str){
					alert("注册成功");
					var url="${pageContext.request.contextPath}/user/login";
					window.location.href=url; 
				}else if("用户登录名已经存在"==data.str){
					alert("注册失败,用户登录名已经存在");
					var url="${pageContext.request.contextPath}/user/regist";
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
			<td colspan="2" align="center"><h3>用户注册</h3></td>
		</tr>
		<tr>
			<td id="tdLeft">用户名:</td>
			<td><input type="text" id="loginName" name="loginName"/></td>
		</tr>
		<tr>
			<td id="tdLeft">密码:</td>
			<td><input type="password" id="loginPwd" name="loginPwd"/></td>
		</tr>
		<tr>
			<td id="tdLeft">性别:</td>
			<td><input type="text" id="gender" name="gender"/></td>
		</tr>
		<tr>
			<td id="tdLeft">电话:</td>
			<td><input type="text" id="telephone" name="telephone"/></td>
		</tr>
		<tr>
			<td id="tdLeft">邮箱:</td>
			<td><input type="text" id="email" name="email"/></td>
		</tr>
		<tr>
			<td id="tdLeft">描述:</td>
			<td><input type="text" id="descripte" name="descripte"/></td>
		</tr>
		<tr>
			<td id="tdLeft">真实姓名:</td>
			<td><input type="text" id="realname" name="realname"/></td>
		</tr>
		<tr>
			<td id="tdLeft">地址：</td>
			<td><input type="text" id="address" name="address"/></td>
		</tr>
		<tr>
			<td id="tdLeft">工作状态:</td>
			<td><input type="text" id="jobStatus" name="jobStatus"/></td>
		</tr>
		<tr>
			<td id="tdLeft">期望工资:</td>
			<td><input type="text" id="salary" name="salary"/></td>
		</tr>
		<tr>
			<td id="tdLeft">毕业学校:</td>
			<td><input type="text" id="school" name="school"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="button" value="注册"
				id="submitBtn" onclick="Check()"/></td>
		</tr>
	</table>
	<div class="login-footer">
		<div class="wrapper">版权所有 © qtwy 保留一切权利。</div>
	</div>
</body>

</html>