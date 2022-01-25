<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form method="post" action="/lesson04/quiz02/add_realtor">
			<div class="mb-3">
				<label for="office">상호명</label>
				<input type="text" name="office" id="office" class="form-control" placeholder="OO공인중개사">
			</div>
			<div class="mb-3">
				<label for="phoneNumber">전화번호</label>
				<input type="text" name="phoneNumber" id="phoneNumber" class="form-control" placeholder="010-0000-0000">
			</div>
			<div class="mb-3">
				<label for="address">주소</label>
				<input type="text" name="address" id="address" class="form-control" placeholder="서울시 강남구 ...">
			</div>
			<div class="mb-3">
				<label for="grade">등급</label>
				<input type="text" name="grade" id="grade" class="form-control" placeholder="4.0">
			</div>
			<input type="submit" class="btn btn-primary">
		</form>
	</div>
</body>
</html>