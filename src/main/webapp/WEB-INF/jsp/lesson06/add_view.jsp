<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<p class="display-4">즐겨 찾기 추가하기</p>
		<form>
			<div class="mb-3">
				<label for="name" class="form-label">제목</label> 
				<input type="text" class="form-control" id="name" name="name" aria-describedby="emailHelp">
			</div>
			<div class="row">
				<label for="url" class="form-label">주소</label> 
				<div class="col-9">
					
					<input type="text" class="form-control" id="url" name="url" aria-describedby="emailHelp">
				</div>
				<div class="mb-3 col-3">
					<input type="button" id="duplicate_check_btn" class="btn btn-info" value="중복확인">
				</div>
			</div>
				
			<div id="duplicate_check_result"></div>
			<div>
				<input type="button" id="addBtn" class="btn btn-success form-control" value="제출">
			</div>
			
		</form>
	</div>

<script>
	$(document).ready(function() {
		let no_duplicate = false;
		
		$("#addBtn").on('click', function(e) {
			// validation check
			let name = $("input[name='name']").val().trim();
			let url = $("input[name='url']").val().trim();
			
			if (name.length < 1) {
				return;
			}
			if (url.length < 1) {
				return;
			}
			
			if (!(url.includes("http://") || url.includes("https://"))) {
				return;
			}
			
			
			console.log(name);
			console.log(url);
			
			$.ajax({
				type: 'post',
				url: "/lesson06/quiz01_add",
				data: {'name': name, 'url':url, 'no_duplicate': no_duplicate},
				success: function(data) {
					if (data["success"] == true) {
						location.href="/lesson06/quiz01_table";
					}
					
				},
				error: function(data) {
					alert("error: " + e);
				}
			
			});
		});
		
		$("#duplicate_check_btn").on('click', function() {
			console.log("check");
			
			url = $("input[name='url']").val().trim();
			$.ajax({
				method: "post",
				url: "/lesson06/quiz01_check_duplicate",
				data: {'url':url},
				success: function(data) {
					if (data["exists_duplicate"] == true) {
						$("#duplicate_check_result").empty();
						$("#duplicate_check_result").append("<span class='text-danger'>중복된 url입니다. </span>");
					}
					else {
						no_duplicate = true;
						$("#duplicate_check_result").empty();
						$("#duplicate_check_result").html("<span class='text-danger'>저장 가능한 url 입니다. </span>");
					}
				},
				error: function(e) {
					alert("e");
				}
			});
		});
	});
</script>

</body>
</html>