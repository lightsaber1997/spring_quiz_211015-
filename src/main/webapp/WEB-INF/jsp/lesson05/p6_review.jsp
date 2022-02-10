<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="/css/lesson05/quiz06/main.css">
<script src="/css/lesson05/quiz06/main.js"></script>
<title>배달의 민족</title>
</head>
<body>
	<div class="main-wrapper">
		<div class="header d-flex align-items-center">
			<div class="title">배달의 민족</div>
		</div>
		<div class="main">
			<div class="title">${store.name } -  리뷰</div>
			<c:choose>
				<c:when test="${not empty result }">
					<c:forEach var="col" items="${result}" varStatus="status">
					<a class="data-card data-card-review">
						<div class="data data1">${col.userName }</div>
						<fmt:formatDate var="createdAt_" value="${col.createdAt}" pattern="yyyy년 MM월 dd일"/>
						<div class="data data2">${createdAt_}</div>
						<div class="data data3">${col.review }</div>
						<div class="data data4">${col.menu }</div>
					</a>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<div>
						작성된 리뷰가 없습니다. 
					</div>
				</c:otherwise>
			</c:choose>
				

		</div>
		<footer>
			<div class="flex-wrapper">
				<div class="flex-item">
					<div class="p1">(주)우아한 형제들</div>
					<div class="p2">고객센터: 1500-1500</div>
				</div>
				
			</div>

		</footer>
	</div>

</body>
</html>