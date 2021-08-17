<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bList</title>
</head>
<body>
	<form action="${contextPath}/board/boardWrite.do">
		<div align="center" >
			<h1>전체 질문 리스트 </h1>
			<table style="width:700px" border="1">
				<tr>
					<td width="40px">번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>작성일</td>
					<td>조회수</td>
				</tr>
				<c:forEach var="bdto" items="${boardList }">
				<tr>
					<td>${bdto.num }</td>
					<td><a href="${contextPath}/board/boardInfo.do?num=${bdto.num}">${bdto.subject }</a></td>
					<td>${bdto.writer }</td>
					<td><fmt:formatDate value="${bdto.regDate }" pattern="yyyy-MM-dd"/></td>
					<td>${bdto.readCount }</td>
				</tr>
				</c:forEach>
			</table>
			<input type="submit" value="글쓰기" >
		</div>
	</form>
</body>
</html>





