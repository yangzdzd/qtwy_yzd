<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<title>企业后台页面</title>
<style type="text/css">
.table {
	width: 1200px;
	height: 700px;
	border-collapse: collapse;
}

iframe {
	width: 100%;
	height: 100%;
}

.tdTop {
	text-align: center;
	height: 100px;
}

.tdLeft {
	width: 180px;
	padding: 5px;
}

.tdSearch {
	height: 80px;
}

body {
	text-align: center;
	background-color: #f5fffa;
}
</style>
</head>
<body>
	<table class="table" align="center" border="1">
		<tr class="trTop">
			<td colspan="2" class="tdTop"><iframe frameborder="0"
					scrolling="no" src="${path}/com/top" name="top"></iframe></td>
		</tr>
		<tr>
			<td class="tdLeft"><iframe frameborder="0"
					src="${path}/com/left" name="left"></iframe></td>
			<td><iframe frameborder="0" src="${path}/com/body" name="body"></iframe>
			</td>
		</tr>
	</table>
</body>
</html>