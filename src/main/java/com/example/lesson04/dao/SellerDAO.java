package com.example.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.lesson04.model.Seller;

@Repository
public interface SellerDAO {
	public void addSeller(
			@Param("nickname") String nickname, 
			@Param("temperature") double temperature, 
			@Param("profileImageUrl") String profileImageUrl);
	public Seller getSeller();
}
