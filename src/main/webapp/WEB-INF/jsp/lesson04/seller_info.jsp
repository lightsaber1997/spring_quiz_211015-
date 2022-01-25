<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<title>Insert title here</title>
<style>
	#title {
		font-size: 3rem;
		font-weight: bold;
	}
	#nickname {
		font-size: 3.5rem;
	}
	#temperature {
		font-size: 2rem;
		font-weight: bold;
	}
</style>
</head>
<body>
	<div class="container">
		<h3 id="title">${title}</h3>
		<img src="${seller.getProfileImageUrl() }">
		<p id="nickname">${seller.getNickname() }</p>
		<p class="text-warning" id="temperature">${seller.getTemperature() }</p>
	</div>
</body>
</html>