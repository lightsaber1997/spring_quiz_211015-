<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<title>득표율</title>
</head>
<body>
	<div class="container">
		<h1>1.후보자 득표율</h1>
		<table class="table text-center">
			<thead>
				<th>기호</th>
				<th>득표수</th>
				<th>득표율</th>
			</thead>
			<tbody>
				<c:forEach var="i" begin="0" end="2">
					<tr>
						<td>${i+1 }</td>
						<td>${candidates[i] }</td>
						<td>${percentages_[i] }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>