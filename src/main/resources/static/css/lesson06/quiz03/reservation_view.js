$(document).ready(function() {
	
	$("#reservation_btn").on({
		"click": function(e) {
			e.preventDefault();

			let name = $(".reservation_form input[name='name']").val().trim();
			let date = $(".reservation_form input[name='date']").val().trim();
			let num_days = $(".reservation_form input[name='num_days']").val().trim();
			let num_guests = $(".reservation_form input[name='num_guests']").val().trim();
			let phoneNumber =$(".reservation_form input[name='phoneNumber']").val().trim();
			
//			console.log(name);
//			console.log(date);
//			console.log(num_days);
//			console.log(num_guests);
//			console.log(phoneNumber);
			const message = validation(name, date, num_days, num_guests, phoneNumber);
			if (message != 'success') {
				alert(message);
				return;
			}
			
			$.ajax({
				url: "/lesson06/quiz03_reservation",
				data: {"name": name, "date": date, 
				"num_days": num_days, "num_guests":num_guests,
				"phoneNumber": phoneNumber},
				method: "post",
				success: function(data){
					if (data["success"] === 'true') {
						location.href = "/lesson06/quiz03_index";
					}
					else {
						alert("입력을 올바르게 해주세요.");
					}
				},
				error: function(e) {
					alert("[error]");
				}
			});			
		}
	});
	
	
	$("#datepicker").datepicker({
		dateFormat: "yy-mm-dd",
		changeMonth: true,
		changeYear: true
	});
});


const validation = function(name, date, num_days, num_guests, phoneNumber) {
	let message = "success";
	if (name.length < 1) {
		message = "이름을 입력해 주세요.";
		return message;
	}
	else if (date.length < 1) {
		message = "날짜를 입력해 주세요.";
		return message;
	}
	else if (num_days.length < 1) {
		message = "숙박일수를 입력해 주세요.";
		return message;
	}
	else if (isNaN(num_days)) {
		message = "숙박일수를 숫자만 올바르게 입력해 주세요.";
		return message;
	}
	else if (num_guests.length < 1) {
		message = "숙박인원을 입력해 주세요.";
		return message;
	}
	else if (isNaN(num_guests)) {
		message = "숙박인원을 숫자만 올바르게 입력해 주세요.";
		return message;
	} 
	else if (phoneNumber.length < 1) {
		message = "전화번호를 입력해 주세요.";
		return message;
	}
	
	// some more validations on the 'phoneNumber'
	let count = 0;
	for (let i = 0; i < phoneNumber.length; i++) {
		if (phoneNumber[i] == '-') {
			count += 1;
		}
	}
	if (count != 2) {
		message = "전화번호를 올바른 형식으로 입력해주세요. (예) 010-1111-2111";
	}
	
	return message;
};