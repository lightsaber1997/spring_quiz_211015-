package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.RealtorBO;
import com.example.lesson04.model.Realtor;

@RequestMapping("/lesson04/quiz02")
@Controller
public class Lesson04Quiz02Controller {
	@Autowired
	private RealtorBO realtorBO;
	@RequestMapping("/1")
	public String display_form() {
		return "lesson04/add_realtor";
	}
	
	@PostMapping("/add_realtor")
	public String add_realtor(@ModelAttribute Realtor realtor, Model model) {
		// insert into db
		realtorBO.insertRealtor(realtor);
		Realtor result = realtorBO.searchById(0);
		model.addAttribute("result", result);
		return "";
	}
}
