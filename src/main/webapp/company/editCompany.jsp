<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>

<script type="text/javascript">
	function submitForm() {
		document.getElementById("companyForm").submit();
	}
</script>
<style type="text/css">
#tdLeft {
	text-align: right;
	padding-left: 140px;
	padding-top: 15px;
}

#divTable {
	margin: 40px;
	padding-left: 50px;
}

table td input {
	width: 500px;
	height: 35px;
	padding-left: 30px;
	margin-left: 20px
}

body {
	background-color: #fff8dc
}
</style>

</head>
<body>
	<form id="companyForm"
		action="${pageContext.request.contextPath }/com/editCompanySubmit"
		method="post" onsubmit="return submitForm();">
		<input type="hidden" name="cid" value="${company.cid }" />
		<div id="divTable">
			<table class="table table-striped table-hover">
				<tr class="info">
					<td colspan="2" align="center" style="padding-right: 150px;"><h3>修改企业信息</h3></td>
				</tr>
				<tbody>
					<tr>
						<td id="tdLeft">登录名:</td>
						<td><input type="text" name="companyLoginName"
							value="${company.companyLoginName}" /></td>
					</tr>
					<tr>
						<td id="tdLeft">企业名称:</td>
						<td><input type="text" name="companyName"
							value="${company.companyName }" /></td>
					</tr>
					<tr>
						<td id="tdLeft">企业类型:</td>
						<td><input type="text" name="companyType"
							value="${company.companyType}" /></td>
					</tr>
					<tr>
						<td id="tdLeft">企业地址:</td>
						<td><input type="text" name="companyAddress"
							value="${company.companyAddress }" /></td>
					</tr>
					<tr>
						<td id="tdLeft">企业网址:</td>
						<td><input type="text" name="companyWebsite"
							value="${company.companyWebsite }" /></td>
					</tr>

					<tr>
						<td id="tdLeft">企业描述:</td>
						<td><input type="text" name="companyDesc"
							value="${company.companyDesc }" /></td>
					</tr>
					<tr>
						<td id="tdLeft">员工数目:</td>
						<td><input type="text" name="empNum"
							value="${company.empNum}" /></td>
					</tr>
					<tr>
						<td colspan="3" align="center">
							<button type="button" class="btn btn-primary btn-lg"
								onclick="submitForm();">保存</button>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</form>
</body>

</html>