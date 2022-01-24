package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.RealEstateBO;

@RequestMapping("/lesson03/quiz03")
@RestController
public class Quiz03Controller {
	@Autowired
	RealEstateBO realEstateBO;
	
	@RequestMapping("/1")
	public String prob1(
			@RequestParam(value="id") int id,
			@RequestParam(value="type") String type,
			@RequestParam(value="price") int price) {
		int rowCount = realEstateBO.update(id, type, price);
		return "수정 성공: " + rowCount;
	}
}
