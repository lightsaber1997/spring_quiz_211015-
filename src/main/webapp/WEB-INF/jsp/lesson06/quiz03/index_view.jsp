<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/" %>

<t:layout_main>
	<jsp:attribute name="extra_js">
      <script src="/css/lesson06/quiz03/index_view.js">
      	
      </script>
    </jsp:attribute>
    <jsp:body>
    	<div class="page-title">예약 목록 보기</div>
    	<table class="table table-striped table-hover text-center ">
    		<thead>
    			<tr>
    				<th>이름</th>
    				<th>예약날짜</th>
    				<th>숙박일수</th>
    				<th>숙박인원</th>
    				<th>전화번호</th>
    				<th>예약상태</th>
    				<th></th>
    			</tr>
    			<c:forEach var="col" items="${result}" varStatus="status">
    				<tr>
    					<td>${col.name }</td>
						<fmt:formatDate var="date_" value="${col.date}" pattern="yyyy년 MM월 dd일"/>
    					<td>${date_ }</td>
    					<td>${col.num_days }</td>
    					<td>${col.num_guests }</td>
    					<td>${col.phoneNumber }</td>
    					<c:choose>
    						<c:when test="${col.status } eq '대기중'">
    							<td class="text-primary">${col.status }</td>
    						</c:when>
    						<c:otherwise>
    							<td class="text-success">${col.status }</td>
    						</c:otherwise>
    					</c:choose>
    					
    					<td><button class="delete-btn btn btn-danger" data-id="${col.id }">삭제</button></td>
    				</tr>
    			</c:forEach>
    		</thead>
    	</table>
    </jsp:body>
</t:layout_main>