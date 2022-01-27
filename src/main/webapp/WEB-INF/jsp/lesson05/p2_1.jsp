<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
		<p class="display-4">멤버십</p>
		<table class="table table-striped text-center">
			<thead>
				<tr>
					<th>이름</th>
					<th>전화 번호</th>
					<th>등급</th>
					<th>포인트</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="member" items="${membership}" varStatus="status">
				<tr>
					<td>${member.name }</td>
					<td>${member.phoneNumber }</td>
					<c:choose>
						<c:when test="${member.grade eq	'VIP'}">
							<td class="text-danger">${member.grade }</td>
						</c:when>
						<c:when test="${member.grade eq 'GOLD' }">
							<td class="text-warning">${member.point }</td>
						</c:when>
						<c:otherwise>
							<td>${member.point }</td>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${member.point >= 5000 }">
							<c:set var="point_class" value="text-primary"/>
						</c:when>
						<c:otherwise>
							<c:set var="point_class" value=" "/>
						</c:otherwise>
					</c:choose>
					<td class="${point_class }" >${member.point}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>