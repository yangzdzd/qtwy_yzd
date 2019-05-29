<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>left</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${path}/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>
<style type="text/css">
	.font{font-size:16px;background-color:#e6e6fa;padding-left:20px;margin-top:15px;}
</style>
</head>
<body>
	<div class="container">
	    <div class="row">
		<ul class="nav nav-list">
			<li class="active font"><a href="${path}/com/findAllCompany" target="body">查询所有企业</a></li>
			<li class="active font"><a href="${path}/user/findAllUser" target="body">查询所有求职者</a></li>
			<li class="active font"><a href="${path}/eboard/findAllEboard" target="body">查询所有公告</a></li>
            <li class="active font"><a href="${path}/main/index" target="_parent">网站首页</a></li>
		</ul>
	   </div>
   </div>
</body>

</html>