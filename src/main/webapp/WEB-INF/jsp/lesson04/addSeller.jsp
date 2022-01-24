<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h3>판매자 추가</h3>
		<form method="post" action="/lesson04/quiz01/add_seller">
			<div class="mb-3">
				<label for="nickname" class="form-label">닉네임
					</label> 
				<input type="text" class="form-control"
					id="nickname" name="nickname" aria-describedby="emailHelp">
			</div>
			<div class="mb-3">
				<label for="profileImageUrl" class="form-label">프로필 사진 url
					</label> 
					<input type="text" class="form-control"
					id="profileImageUrl" name="profileImageUrl" aria-describedby="emailHelp">
			</div>
			<div class="mb-3">
				<label for="temperature" class="form-label">온도
					</label> 
					<input type="text" class="form-control"
					id="temperature" name="temperature" aria-describedby="emailHelp">
			</div>
			<button type="submit" class="btn btn-primary">추가</button>
		</form>
	</div>
</body>
</html>