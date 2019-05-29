<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>重新登录</title>
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>
<script type="text/javascript" src="${path}/js/WdatePicker/calendar.js"></script>
<style type="text/css">
body {
	background-color: #fff8dc
}
</style>
<script type="text/javascript">
	$(function(){
		alert("正在重新登录......",3000);
		var url="${pageContext.request.contextPath}/com/login";
		window.parent.location.href=url;
	});
</script>
</head>
<body>
</body>

</html>