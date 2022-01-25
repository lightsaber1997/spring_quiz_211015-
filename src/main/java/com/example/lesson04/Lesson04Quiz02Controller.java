package com.example.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.model.Realtor;

@RequestMapping("/lesson04/quiz02")
@Controller
public class Lesson04Quiz02Controller {
	
	@RequestMapping("/1")
	public String display_form() {
		return "lesson04/add_realtor";
	}
	
	@PostMapping("/add_realtor")
	public String add_realtor(@ModelAttribute Realtor realtor, Model model) {
		// insert into db
		
	}
}
