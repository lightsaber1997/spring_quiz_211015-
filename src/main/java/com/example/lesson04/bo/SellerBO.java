package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.SellerDAO;
import com.example.lesson04.model.Seller;

@Service
public class SellerBO {
	@Autowired
	SellerDAO sellerDAO;
	
	public void addSeller(String nickname, double temperature, String profileImageUrl) {
		sellerDAO.addSeller(nickname, temperature, profileImageUrl);
	}
	
	public Seller getSeller() {
		return sellerDAO.getSeller();
	}
}
