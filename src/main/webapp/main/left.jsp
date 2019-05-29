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
		   	<c:choose>
				<c:when test="${empty sessionScope.currUser}">
					  <ul class="nav nav-list">
			               <li class="active font"><a href="${path}/main/index" target="_parent">网站首页</a></li>
			               <li class="active font"><a href="${path}/job/findAllJob" target="body">职位搜索</a></li>
			               <li class="active font"><a href="${path}/eboard/showNews" target="_parent">职位新闻</a></li>		  
			               <li class="active font"><a href="${path}/com/regist" target="_parent">企业注册</a></li>	
			               <li class="active font"><a href="${path}/com/login" target="_parent">企业登录</a></li>		
			           </ul>
				</c:when>
				<c:when test="${!empty sessionScope.currUser}">
			           <ul class="nav nav-list">
			               <li class="active font"><a href="${path}/main/index" target="_parent">网站首页</a></li>
			               <li class="active font"><a href="${path}/job/findAllJob" target="body">职位搜索</a></li>
			               <li class="active font"><a href="${path}/apply/applyRecord?realname=${sessionScope.currUser.realname}" target="body">职位投递记录</a></li>
			               <li class="active font"><a href="${path}/favorite/favoriteRecord?realname=${sessionScope.currUser.realname}" target="body">职位收藏夹</a></li>
			         	   <li class="active font"><a href="${path}/eboard/showNews" target="_parent">职位新闻</a></li>
			        	   <li class="active font"><a href="${path}/com/regist" target="_parent">企业注册</a></li>	
			               <li class="active font"><a href="${path}/com/login" target="_parent">企业登录</a></li>		  
			           </ul>
				</c:when>    
			</c:choose>
	   </div>
   </div>
</body>
</html>