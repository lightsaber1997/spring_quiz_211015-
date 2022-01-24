package com.example.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.RealEstateBO;
import com.example.lesson03.model.RealEstate;

@RequestMapping("/lesson03/quiz01")
@RestController
public class Quiz01Controller {
	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/1")
	public RealEstate ex01(@RequestParam(value="id")int id) {
		return realEstateBO.select_by_id(id);
	}
	@RequestMapping("/2")
	public List<RealEstate> ex02(@RequestParam(value="rent_price")int rent_price) {
		return realEstateBO.selectByRentPrice(rent_price);
	}
	@RequestMapping("/3")
	public List<RealEstate> ex03(@RequestParam(value="area") int area, @RequestParam(value="price") int price) {
		return realEstateBO.selectByAreaAndPrice(area, price);
	}
	
	

}
