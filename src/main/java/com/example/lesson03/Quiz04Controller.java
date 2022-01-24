package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.RealEstateBO;


@RestController
public class Quiz04Controller {
	@Autowired
	private RealEstateBO realEstateBO;
	@RequestMapping("/lesson03/quiz04")
	public String prob1(@RequestParam("id") int id) {
		int rowCount = realEstateBO.deleteById(id);
		return "삭제 성공 : " + rowCount;
	}
}
