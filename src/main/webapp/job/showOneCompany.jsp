<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>企业详细信息</title>
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>

<script type="text/javascript">
	function submitForm() {
		document.getElementById("companyForm").submit();
	}
</script>
<style type="text/css">
table td{padding-top:15px;}
#divTable {
	width:750px;
	height:350px;
	margin-left:120px;
	margin-top:50px;
}
body {
	background-color: #f5fffa;
}
#tdLeft{text-align:right;padding-left:70px;}
#tdRight{padding-left:40px;}
#btn{text-align:center;}
</style>
<!-- 传递参数到 申请职位的ApplyController -->
<script type="text/javascript">
	<!--投递职位-->
	function sendJob(){
		var jobName_=$("#jobName").val();
		var jobAddress_=$("#jobAddress").val();
		var jobSalary_=$("#jobSalary").val();
		var releaseTime_=$("#releaseTime").val();
		var realname_=$("#realname").val();
		var companyName_=$("#companyName").val();
		$.ajax({
			url:"${pageContext.request.contextPath}/apply/accpet",
			data:{
			     jobName:jobName_,
			     jobAddress:jobAddress_,
			     jobSalary:jobSalary_,
			     releaseTime:releaseTime_,
			     realname:realname_,
			     companyName:companyName_
			},//给服务器的参数
			type:"POST",
			dataType:"json",
			success:function(data){
				if("您还没有登录！"==data.str){
					alert("您还没有登录，请登录！");
					var url="${pageContext.request.contextPath}/login/login";
					window.parent.location.href=url; 
				}else if("投递成功！"==data.str){
					alert(data.str);
					history.go(-1);
				}else if("请不要重复投递！"==data.str){
					alert("请不要重复投递！");
				}else{
					alert("插入数据失败！");
				}
			}
		});
	}
	<!--收藏职位-->
	function saveJob(){
		var jobName_=$("#jobName").val();//职位名称
		var jobAddress_=$("#jobAddress").val();//职位地址
		var jobSalary_=$("#jobSalary").val();//职位薪资
		var realname_=$("#realname").val();//真实名字
		var saveTime=new Date();//收藏时间
		var companyName_=$("#companyName").val();//公司的名字
		$.ajax({
			url:"${pageContext.request.contextPath}/favorite/favorite",//收藏
			data:{
			     jobName:jobName_,
			     jobAddress:jobAddress_,
			     jobSalary:jobSalary_,
			     realname:realname_,
			     saveTime:saveTime,
			     companyName:companyName_
			},//给服务器的参数
			type:"POST",
			dataType:"json",
			success:function(data){
				if("您还没有登录！"==data.str){
					alert("您还没有登录，请登录！");
					var url="${pageContext.request.contextPath}/login/login";
					window.parent.location.href=url;
				}else if("收藏成功！"==data.str){
					alert(data.str);
					history.go(-1);
				}else if("请不要重复收藏！"==data.str){
					alert("请不要重复收藏！");
				}else{
					alert("插入数据失败！");
				}
			}
		});
	}
</script>

</head>
<body>	
		<input type="hidden" value="${jobName}" id="jobName"/>
		<input type="hidden" value="${jobAddress}" id="jobAddress"/>
		<input type="hidden" value="${releaseTime}" id="releaseTime"/>
		<input type="hidden" value="${sessionScope.currUser.realname}" id="realname"/>
		<input type="hidden" value="${jobSalary}" id="jobSalary"/>
		<input type="hidden" value="${companyName}" id="companyName"/>
		<div id="divTable">
			<table class="table table-striped table-hover">
				<tr class="info">
					<td colspan="2"><span style="text-align:center;"><h3>企业详细信息</h3></span></td>
				</tr>
				<tr>
					<td id="tdLeft">企业名称:</td>
					<td id="tdRight">${company.companyName}</td>
				</tr>
				<tr>
					<td id="tdLeft">企业类型:</td>
					<td id="tdRight">${company.companyType}</td>
				</tr>
				<tr>
					<td id="tdLeft">企业地址:</td>
					<td id="tdRight">${company.companyAddress }</td>
				</tr>
				<tr>
					<td id="tdLeft">企业网址:</td>
					<td id="tdRight">${company.companyWebsite }</td>
				</tr>
		
				<tr>
					<td id="tdLeft">企业描述:</td>
					<td id="tdRight">${company.companyDesc }</td>
				</tr>
				<tr>
					<td id="tdLeft">员工数目:</td>
					<td id="tdRight">${company.empNum}</td>
				</tr>
				<tr>
					<td colspan="2">
						<div id="btn">
							<button type="button" class="btn btn-default" onclick="sendJob()">申请职位</button>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="button" class="btn btn-default" onclick="saveJob()">收藏职位</button>
						</div>
					</td>
				</tr>
			</table>
		</div>
</body>
</html>