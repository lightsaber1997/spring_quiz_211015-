package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Quiz04 {
	@RequestMapping("/lesson01/quiz03/1")
	public String problem1() {
		return "lesson01/quiz03_1";
	}
}
