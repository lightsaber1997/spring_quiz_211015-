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
			<div class="title">우리 동네 가게</div>
			<c:forEach var="col" items="${result}" varStatus="status">
				<a class="data-card data-card-store" href="/lesson05/p6_1?storeId=${col.id}">
					<div class="data data1">${col.name }</div>
					<div class="data data2">전화번호: ${col.phoneNumber }</div>
					<div class="data data3">주소: ${col.address }</div>
				</a>
			</c:forEach>

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