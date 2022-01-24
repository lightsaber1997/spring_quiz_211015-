package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.example.lesson03.model.RealEstate;
import java.util.List;
import java.util.List;
@Repository
public interface RealEstateDAO {
	public RealEstate select_by_id(@Param("id") int id);
	public List<RealEstate> selectByRentPrice(@Param("price_limit") int price_limit);
	public List<RealEstate> selectByAreaAndPrice(@Param("areaLimit") int area, @Param("priceLimit") int price);
	public int insertRealEstate(RealEstate realEstate);
	public int insertRealEstateByField(
			@Param("realtorId") int realtorId,
			@Param("address") String address,
			@Param("area") int area,
			@Param("type") String type,
			@Param("price") int price,
			@Param("rentPrice") int rentPrice);
	public int update(
			@Param("id") int id, 
			@Param("type") String type, 
			@Param("price") int price);
	public int deleteById(int id);
}
