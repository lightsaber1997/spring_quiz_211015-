$(document).ready(function() {
	$(".main .data-card").on({
		mouseenter: function() {
			$(this).css("background-color", "#d3ffd8");
		},
		mouseleave: function() {
			$(this).css("background-color", "white");
		}
	});
	$(".header .back-button").on({
		"click": function() {
			window.history.back();
		}
	});
	$(".header .title").on({
		"click": function() {
			location.href="/lesson05/p6_0";
		}
	});
});