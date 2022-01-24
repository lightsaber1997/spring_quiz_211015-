package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.RealEstateBO;
import com.example.lesson03.model.RealEstate;

@RequestMapping("/lesson03/quiz02")
@RestController
public class Quiz02Controller {
	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/1")
	public String prob1() {
		RealEstate realEstate = new RealEstate();
		
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int row = realEstateBO.insertRealEstate(realEstate);
		
		return "success row count: " + row; 
	}
	
	@RequestMapping("/2")
	public String prob2() {
		int rowCount = realEstateBO.insertRealEstateByField(1, "썅떼빌리버 오피스텔 814호",  45, "월세", 100000, 120);
		return "row count = " + rowCount;
	}
	
	
}
