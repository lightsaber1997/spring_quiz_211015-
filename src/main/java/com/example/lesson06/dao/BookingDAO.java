package com.example.lesson06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.lesson06.model.Booking;

public interface BookingDAO {
	public List<Booking> selectAll();
	public void insert(
			@Param("name") String name,
			@Param("date") String date, 
			@Param("num_days") int num_days, 
			@Param("num_guests") int num_guests, 
			@Param("phoneNumber") String phoneNumber,
			@Param("status") String status);
	public List<Booking> selectByPhoneNumber(String phoneNumber);
	public void deleteById(int id);
}
