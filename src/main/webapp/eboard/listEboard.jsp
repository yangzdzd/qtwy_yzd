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

table td {
	text-align: center;
}
</style>
</head>
<script type="text/javascript">
	function editEboard(eid) {
		var url = "${pageContext.request.contextPath}/eboard/updateEboard?eid=" + eid;
		window.location.href = url;
	}
	function deleteEboard(eid) {
		var url = "${pageContext.request.contextPath}/eboard/deleteEboard?eid="+ eid;
		window.location.href = url;
	}
	function addEboard() {
        window.location.href = "${path}/eboard/addEboard.jsp";
    }
</script>
<body>
	<input type="hidden" value="${eboard.eid}" />
	<div id="tableAll">
		<input type="button" onclick="addEboard()" value="添加公告"/>
		<table class="table  table-hover table-bordered">
			<tr class="info">
				<td colspan="10" align="center"><h3>公告信息</h3></td>
			</tr>
			<tr class="success" height="40px;" style="padding-top: '10px;'">
				<td width="150px">标题</td>
				<td>新闻</td>
				<td width="50px">操作</td>
			</tr>
			<c:forEach items="${eboardList}" var="eboard">
				<tr>

					<td>${eboard.title}</td>

					<td>${eboard.news}</td>

					<td><a href="javascript:void(0)"
						onclick="editEboard('${eboard.eid}')">修改</a>
						 <a href="javascript:void(0)" onclick="deleteEboard('${eboard.eid}')">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>

</html>