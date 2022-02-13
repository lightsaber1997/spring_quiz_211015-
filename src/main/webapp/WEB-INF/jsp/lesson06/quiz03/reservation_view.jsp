<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/" %>

<t:layout_main>
	<jsp:attribute name="extra_css">
      <link href="/css/lesson06/quiz03/reservation_view.css" rel="stylesheet">
    </jsp:attribute>
    <jsp:attribute name="extra_js">
      <script src="/css/lesson06/quiz03/reservation_view.js">
      	
      </script>
    </jsp:attribute>
    <jsp:body>
    	<h1 class="title">
    		예약하기
    	</h1>
    	<div>
    		<form class="reservation_form">
    			<div class="mb-3">
				  <label  class="form-label">이름</label>
				  <input type="email" class="form-control" name="name">
				</div>
				<div class="mb-3">
				  <label  class="form-label">예약날짜</label>
				  <input type="text" class="form-control" id="datepicker" name="date">
				</div>
				<div class="mb-3">
				  <label  class="form-label">숙박일수</label>
				  <input type="email" class="form-control" name="num_days">
				</div>
				<div class="mb-3">
				  <label  class="form-label">숙박인원</label>
				  <input type="email" class="form-control" name="num_guests">
				</div>
				<div class="mb-3">
				  <label  class="form-label">전화번호</label>
				  <input type="email" class="form-control" name="phoneNumber" placeholder="예) 010-1111-2301">
				</div>
				<div class="d-grid gap-2">
					<button type="button" id="reservation_btn" class="btn btn-primary">예약하기</button>
				</div>
				
    		
    		</form>
    	</div>
    </jsp:body>
    
    
</t:layout_main>