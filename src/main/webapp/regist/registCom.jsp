<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>企业注册</title>
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>
<style type="text/css">
table td input {
	width: 500px;
	height: 35px;
	background-color: #ffdab9;
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
	margin-left: 100px;
	padding-left: 240px;
	margin-right: 100px;
}

body {
	background-color: #fff0f5
}
</style>
<script type="text/javascript">
		function check(){
			var companyLoginName=document.getElementById("companyLoginName").value;//公司登录名
			var companyPwd=document.getElementById("companyPwd").value;//密码
			var companyName=document.getElementById("companyName").value;//公司名称
			var companyType=document.getElementById("companyType").value;//公司类型
			var companyAddress=document.getElementById("companyAddress").value;//公司地址
			var companyWebsite=document.getElementById("companyWebsite").value;//公司网址
			var companyDesc=document.getElementById("companyDesc").value;//公司描述
			var empNum=document.getElementById("empNum").value;//公司人员
			if(companyLoginName.length==0){
				alert("企业登录名不能为空");
				return false;
			}else{ 
				var pattern = /^[0-9a-zA-Z]+$/;
				if(!pattern.test(document.getElementById("companyLoginName").value))
				{
					alert('\n用户名只可输入数字或者字母!');
					return false;
				}
			}
			if(companyPwd.length==0){
				alert("企业密码不能为空");
				return false;
			}
			if(companyName.length==0){
				alert("公司名不能为空！");
				return false;
			}
			$.ajax({
				url:"${pageContext.request.contextPath}/com/registCom",
				data:{
					 companyLoginName:companyLoginName,//公司登录名
					 companyPwd:companyPwd,//密码
					 companyName:companyName,//公司名称
					 companyType:companyType,//公司类型
					 companyAddress:companyAddress,//公司地址
					 companyWebsite:companyWebsite,//公司网址
					 companyDesc:companyDesc, //公司描述
					 empNum:empNum//公司人员					
				},
				type:"POST",
				dataType:"json",
				success:function(data){
					if("success"==data.str){
						alert("注册成功");
						var url="${pageContext.request.contextPath}/com/login";
						window.location.href=url; 
					}else if("公司登录名已经存在"==data.str){
						alert("注册失败,公司登录名已经存在");
						var url="${pageContext.request.contextPath}/com/regist";
						window.location.href=url; 
					}else if("公司名已经存在"==data.str){
						alert("注册失败,公司名已经存在");
						var url="${pageContext.request.contextPath}/com/regist";
						window.location.href=url; 
					}
				}
			});
		}
</script>
</head>
<body>
	<div id="divTable">
		<table class="table table-hover">
			<tr>
				<td colspan="2" align="center" style="padding-right: 120px"><h3>企业注册</h3></td>
			</tr>
			<tr>
				<td id="tdLeft">登录名:</td>
				<td><input type="text" name="companyLoginName" id="companyLoginName" /></td>
			</tr>
			<tr>
				<td id="tdLeft">登录密码:</td>
				<td><input type="password" name="companyPwd" id="companyPwd"/></td>
			</tr>
			<tr>
				<td id="tdLeft">公司名</td>
				<td><input type="text" name="companyName" id="companyName" /></td>
			</tr>
			<tr>
				<td id="tdLeft">公司类型</td>
				<td><input type="text" name="companyType" id="companyType"/></td>
			</tr>
			<tr>
				<td id="tdLeft">公司地址:</td>
				<td><input type="text" name="companyAddress" id="companyAddress" /></td>
			</tr>
	
			<tr>
				<td id="tdLeft">公司网址:</td>
				<td><input type="text" name="companyWebsite" id="companyWebsite"/></td>
			</tr>
			<tr>
				<td id="tdLeft">公司描述:</td>
				<td><input type="text" name="companyDesc" id="companyDesc"/></td>
			</tr>
			<tr>
				<td id="tdLeft">员工人数</td>
				<td><input type="text" name="empNum" id="empNum"/></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="button" value="注册"
					id="saveBtn" class="btn btn-default" onclick="check()" /></td>
			</tr>
		</table>
		</div>
</body>

</html>