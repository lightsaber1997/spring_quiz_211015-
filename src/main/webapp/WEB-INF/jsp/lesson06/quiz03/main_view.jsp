<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/" %>

<t:layout_main>
	<jsp:attribute name="extra_css">
      <link href="/css/lesson06/quiz03/main_view.css" rel="stylesheet">
    </jsp:attribute>
    <jsp:attribute name="extra_js">
      <script src="/css/lesson06/quiz03/main_view.js">
      	
      </script>
    </jsp:attribute>
    <jsp:body>

    		<img class="main-img" src="/images/lesson06/vacation2.jpg">

    	<div class="content1 d-flex">
    		<div class="ppp ppp1 col-4 d-flex justify-content-center align-items-center">
    			<div>
    				<p>실시간</p>
    				<p>예약하기</p>
    			</div>
    			
    		</div>
    		<div class="ppp ppp2 col-4 d-flex justify-content-center">
    			<div class="col-10">
    				<div class="temp1">예약 확인</div>
	    			<form class="check-reservation-form">
	    				<div class="row mb-3 ">
	    					<label class="col-sm-12 col-md-3 col-form-label">이름:</label>
						    <div class="col-sm-12 col-md-9">
						      <input type="text" class="form-control" name="name">
						    </div>
	    				</div>
	    				<div class="row">
	    					<label class="col-sm-3 col-form-label">전화번호:</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" name="phoneNumber">
						    </div>
	    				</div>
	    				<div class="row">
	    					<button type="button" class="check-reservation-btn btn btn-success ">조회하기</button>
	    				</div>
	    				
	    			</form>
    			</div>
	    			
    		</div class="col-4">
    		<div class="ppp ppp3 col-4 d-flex justify-content-center align-items-center">
    			<div>
    				<p>예약문의:</p>
    				<p>010-0000-1111</p>
    			</div>
    			
    		</div>
    	</div>
    </jsp:body>
    
    
</t:layout_main>