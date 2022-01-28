<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
		<table class="table text-center">
			<thead>
				<tr>
					<th>No</th>
					<th>이름</th>
					<th>전화번호</th>
					<th>국적</th>
					<th>이메일</th>
					<th>자기소개</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="row" items="${members }" varStatus="status">
					<tr>
						<td>${status.count }</td>
						<td>${row.name }</td>
						
						<c:choose>
							<c:when test="${fn:startsWith(row.phoneNumber, '010') }">
								<td>${row.phoneNumber }</td>
							</c:when>
							<c:otherwise>
								<td>유효하지 않은 전화번호</td>
							</c:otherwise> 
						</c:choose>
						
						<td>삼국-${fn:split(row.nationality, ' ')[1] }</td>
						<td>
							<strong>${fn:split(row.email, '@')[0] }</strong>@${fn:split(row.email, '@')[1] }
						</td>
						<c:choose>
							<c:when test="${fn:length(row.introduce)>15 }">
								<td>${fn:substring(row.introduce, 0, 15) } ...</td>
							</c:when>
							<c:otherwise>
								<td>${row.introduce }</td>
							</c:otherwise>
						</c:choose>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>