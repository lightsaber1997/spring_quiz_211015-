
<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="extra_css" fragment="true" %>
<%@attribute name="extra_js" fragment="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<link rel="stylesheet" href="/css/lesson06/quiz03/layout_main.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<jsp:invoke fragment="extra_css"/>


<title>통나무 팬션</title>
</head>
<body>
	<div class="container">
		<header class="header">
			<div class="title">통나무 펜션</div>
			<div class="navigation d-flex align-items-center">
				
					<a href="/lesson06/quiz03_main" class="menu">펜션소개</a>
				
				
					<a class="menu">객실보기</a>
				
				
					<a href="/lesson06/quiz03_reservation_view" class="menu">예약하기</a>
				
				
					<a href="/lesson06/quiz03_index" class="menu">예약목록</a>
				

			</div>
		</header>
		<section class="main">
			<jsp:doBody/>
		</section>
		<footer class="footer">
			<div class="rrr rrr1">
				제주특별자치도 제주시 구좌읍 종달리 660
			</div>
			<div class="rrr rrr2">
				사업자등록번호: 111-22-25522222 / 농어촌민박사업자지정 / 대표: 김바다
			</div>
			<div class="rrr rrr3">
				Copyright 2025 tongnamu. All right reserved.
			</div>
		</footer>
	</div>
	<jsp:invoke fragment="extra_js"/>
</body>
</html>