<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<body>
	<h1>${name }</h1><br>
	<table>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>글쓴이</td>
			<td>작성일자</td>
			<td>좋아요</td>
		</tr>
		<c:forEach items="${list }" var="row">
		<tr>
			<td>${row.bno }</td>
			<td><a href="./detail?bno=${row.bno }">${row.btitle }</a></td>
			<td>${row.bwrite }</td>
			<td>${row.bdate }</td>
			<td>${row.blike }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>