$(document).ready(function() {
	$(".main .data-card").on({
		mouseenter: function() {
			$(this).css("background-color", "#d3ffd8");
		},
		mouseleave: function() {
			$(this).css("background-color", "white");
		}
	});
});