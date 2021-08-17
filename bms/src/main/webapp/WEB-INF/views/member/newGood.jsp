<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%request.setCharacterEncoding("UTF-8");%>  

<div id="ad_main_banner">
	<ul class="bjqs">
	    <li><a href="${contextPath}/goods/goodsDetail.do?goodsId=1"><img width="775" height="145" src="${contextPath}/resources/image/main_banner01.jpg"></a></li>
		<li><a href="${contextPath}/goods/goodsDetail.do?goodsId=2"><img width="775" height="145" src="${contextPath}/resources/image/main_banner02.jpg"></a></li>
		<li><a href="${contextPath}/goods/goodsDetail.do?goodsId=3"><img width="775" height="145" src="${contextPath}/resources/image/main_banner03.jpg"></a></li>
	</ul>
</div>
<div class="main_book" >
<c:set  var="goodsCount" value="0" />
 <h3>신간</h3>
 <c:forEach var="item" items="${goodsMap.newbook }" >
   <c:set var="goodsCount" value="${goodsCount+1 }" />
   <div class="book">
   	<a href="${contextPath}/goods/goodsDetail.do?goodsId=${item.goodsId }">
   	 <img class="link"  src="${contextPath}/resources/image/1px.gif">
   	</a>
   <img width="121" height="154" src="${contextPath}/thumbnails.do?goodsId=${item.goodsId}&fileName=${item.goodsFileName}">
   <div class="title">${item.goodsTitle }</div>
   <div class="price"><fmt:formatNumber  value="${item.goodsPrice}" type="number" var="goodsPrice" />${goodsPrice}원</div>
   </div>
   <c:if test="${goodsCount==15 }">
     <div class="book">
       <font size=20> <a href="#">more</a></font>
     </div>
   </c:if>
 </c:forEach>
</div>

<div class="clear"></div>
<div id="ad_sub_banner">
	<li><a href="https://www.baemin.com/"><img width="775" height="145" src="${contextPath}/resources/image/deliveryService.PNG"></a></li>
</div>
<div class="clear"></div>

