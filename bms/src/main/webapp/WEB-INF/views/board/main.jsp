<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>


<body>
	<form target="_blank" action="${contextPath}/board/boardList.do">
		<div align="center" style="padding-top: 100px">
			<img src="../resources/image/QnA_logo.jpg" width="800px" height="500px"><br><br><br><br>
			<input type="submit" value="질문게시판 보기">
		</div>
	</form>	
</body>
</html>