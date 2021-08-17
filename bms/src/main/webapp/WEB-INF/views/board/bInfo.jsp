<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bInfo</title>
</head>
<body>
	<div align="center" style="padding-top: 100px">
	<div align="center">
		<h1>게시글 보기</h1>
		<br>
	</div>
		<table style="width: 700px; text-align: center" border="1">
			<colgroup>
				<col width="20%">
				<col width="80%">
			</colgroup>
			<tr>
				<td>글번호</td>
				<td>${bdto.num}</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td>${bdto.readCount}</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>${bdto.writer}</td>
			</tr>
			<tr>
				<td>작성일</td>
				<td><fmt:formatDate value="${bdto.regDate}" pattern="yyyy-MM-dd"/> </td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>${bdto.email}</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${bdto.subject}</td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td>${bdto.content}</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="수정하기" onclick="location.href='${contextPath}/board/boardFormUpdate.do?num=${bdto.num}'">
					<input type="button" value="삭제하기" onclick="location.href='${contextPath}/board/boardDelete.do?num=${bdto.num}'">
					<input type="button" value="목록보기" onclick="location.href='${contextPath}/board/boardList.do'">
				</td>
			</tr>
		</table>
	</div>
</body>
</html>