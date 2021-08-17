<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="${contextPath}/resources/jquery/jquery-3.5.1.min.js"></script>
<title>bUpdate</title>
</head>
<script>

	function update_board(bdto){
		var content = document.content;
		
		$.ajax({
			type: "post",
			url : "${contextPath}/board/controller/boardUpdate.do",
			data : {
				bdto : bdto
			},
			success : function(){
				alert("게시글을 수정했습니다.");
			}
		});
	}
	

</script>
<body>
	<div align="center" style="padding-top: 100px">
		<form action="${contextPath}/board/boardUpdate.do" method="post">
			<div align="center">
				<h1>게시글 수정</h1>
				<br>
			</div>
			<table style="width: 700px;" border="1">
				<tr>
					<td>작성자</td>
					<td>${bdto.writer}</td>
				</tr>
				<tr>
					<td>작성일</td>
					<td><fmt:formatDate value="${bdto.regDate}" pattern="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="subject" value="${bdto.subject}" size="70"/></td>
				</tr>
				<tr>
					<td>패스워드</td>
					<td><input type="password" name="password" size="70"/></td>
				</tr>
				<tr>
					<td>글내용</td>
					<td><textarea rows="10" cols="60" name="content">${bdto.content}</textarea></td>
				</tr>
				<tr align="center">
					<td colspan="4">
						<input type="hidden" name="num" value="${bdto.num }" /> 
						<input type="submit" value="글수정" />
						<!-- ajax 안먹음 
						<input type="button" value="수정" onclick="update_board('${bdto}')" />
						-->
						<input type="button" onclick="location.href='${contextPath}/board/boardList.do'" value="전체글보기" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>