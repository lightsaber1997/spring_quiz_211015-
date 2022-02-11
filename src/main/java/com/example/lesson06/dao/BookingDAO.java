package com.example.lesson06.dao;

import java.util.List;

import com.example.lesson06.model.Booking;

public interface BookingDAO {
	public List<Booking> selectAll();
}
