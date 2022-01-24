package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.lesson03.dao.RealEstateDAO;
import com.example.lesson03.model.RealEstate;
import java.util.List;
@Service
public class RealEstateBO {
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate select_by_id(int id) {
		return realEstateDAO.select_by_id(id);
	}
	
	public List<RealEstate> selectByRentPrice(int price_limit) {
		return realEstateDAO.selectByRentPrice(price_limit);
	}
	
	public List<RealEstate> selectByAreaAndPrice(int area, int price) {
		return realEstateDAO.selectByAreaAndPrice(area, price);
	}
	
	public int insertRealEstate(RealEstate realEstate) {
		return realEstateDAO.insertRealEstate(realEstate);
	}
	
	public int insertRealEstateByField(
			int realtorId,
			String address,
			int area,
			String type,
			int price,
			int rentPrice) {
		return realEstateDAO.insertRealEstateByField(realtorId, address, area, type, price, rentPrice);
		
	}
	
	public int update(int id, String type, int price) {
		return realEstateDAO.update(id, type, price);
	}
	
	public int deleteById(int id) {
		return realEstateDAO.deleteById(id);
	}
	
}
