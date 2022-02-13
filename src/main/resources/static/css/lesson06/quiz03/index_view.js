$(document).ready(function() {
	$(".delete-btn").on({
		"click": function() {
			let id = $(this).data("id");
			// console.log(id);
			
			$.ajax({
				method: 'post',
				url: '/lesson06/quiz03_delete_by_id',
				data: {"id": id},
				success: function(data) {
					location.reload();
				},
				error: function(e) {
					alert("[error]");
				}
			});
		}
	});
});