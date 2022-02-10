<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<p class="display-4">즐겨찾기 목록</p>
		<table class="table" id="url_table">
			<thead>
				<tr>
					<th>No.</th>
					<th>이름</th>
					<th>주소</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="col" items="${result}" varStatus="status">
					<tr>
						<td>${status.count }</td>
						<td>${col.name }</td>
						<td>${col.url }</td>
						<td><button data-id="${col.id}" class="delete_btn btn btn-danger">삭제</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<script>
	$(document).ready(function() {
		$("#url_table .delete_btn").on("click", function(){
			console.log($(this).data("id"));
			let url_id = $(this).data("id");
			$.ajax({
				method: "post",
				data: {"id": url_id},
				url: "/lesson06/quiz01_delete",
				success: function(data) {
					console.log("success");
					console.log(data);
					
					refresh_table(data);
				},
				error: function(e) {
					console.log(e);
				}
			});
		});
		
		
			
	});
	
	const refresh_table = function(data) {
		let table_body = $("#url_table tbody");
		table_body.empty();
		
		let index  = 1;
		for (key in data) {
			let name = data[key][0];
			let url = data[key][1];
			
			table_body.append("<tr>" + 
					"<td>" + index + "</td>" + 
					"<td>" + name + "</td>" +  
					"<td>" + url + "</td>" + 
					"<td><button data-id=" + key + " class='delete_btn btn btn-danger'>삭제</button></td>" +
					"</tr>");
			
			
			index += 1;
		}
	}
</script>
</body>
</html>