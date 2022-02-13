$(document).ready(function() {
	$(".check-reservation-btn").on({
		'click': function() {
			let name = $(".check-reservation-form input[name='name']").val().trim();
			let phoneNumber = $(".check-reservation-form input[name='phoneNumber']").val().trim();
			console.log(name);
			console.log(phoneNumber);
			
			
			$.ajax({
				type: "post",
				url: "/lesson06/quiz03_check_reservation",
				data: {"name": name, "phoneNumber":phoneNumber },
				success: function(data) {
					let message = "";
					if (data["exist"] == "true") {
						message = "";
						message += `이름: ${data["name"]}\n`;
						message += `날짜: ${data["date"]}\n`;
						message += `날짜: ${data["num_days"]}\n`;
						message += `날짜: ${data["num_guests"]}\n`;
						message += `날짜: ${data["status"]}\n`;
					}
					else {
						message = "예약 내역이 없습니다";
					}
					alert(message);
				},
				error: function(e) {
					alert("error")
				}
			});
		}
	});
});