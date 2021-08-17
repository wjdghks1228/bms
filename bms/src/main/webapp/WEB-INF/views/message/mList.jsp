<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mList</title>
</head>
<body>
		<div align="center" >
			<h1>공지사항 </h1>
			<table style="width:700px" border="1">
				<tr>
					<td width="40px">번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>내용</td>
				</tr>
				<c:forEach var="mdto" items="${messageList }">
				<tr>
					<td>${mdto.num }</td>
					<td><a href="${contextPath}/board/boardInfo.do?num=${mdto.num}">${mdto.subject }</a></td>
					<td>${mdto.writer }</td>
					<td><fmt:formatDate value="${mdto.regDate }" pattern="yyyy-MM-dd"/></td>
				</tr>
				</c:forEach>
			</table>
		</div>
</body>
</html>





