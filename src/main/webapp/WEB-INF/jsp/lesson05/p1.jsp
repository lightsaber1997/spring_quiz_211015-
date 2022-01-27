<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>1. JSTL Core 변수</h3>
	<c:set var="number1" value="36"/>
	<c:set var="number2" value="3" />
	<p>첫번째 숫자: ${number1 }</p>
	<p>두번째 숫자: ${number2 }</p>
	
	<h3>2. JSTL Core 연산</h3>
	<p>더하기: ${number1+number2 }</p>
	<p>빼기: ${number1-number2 }</p>
	<p>곱하기: ${number1*number2 }</p>
	<p>나누기: ${number1/number2 }</p>
	
	<h3>3. JSTL Core out</h3>
	<p><c:out value="<title>core out</title>"/></p>
	
	<h3>4. JSTL Core if</h3>
	<c:set var="avg" value="${(number1+number2)/2 }"/>
	<c:if test="${avg >= 10 }">
		<h1>${avg }</h1>
	</c:if>
	<c:if test="${avg < 10 }">
		<h3>${avg }</h3>
	</c:if>
	
	<c:if test="${(number1 * number2) > 100 }">
		<c:out value="<script>alert('너무 큰 수입니다. ')</script>" escapeXml="false"/>
	</c:if>
</body>
</html>