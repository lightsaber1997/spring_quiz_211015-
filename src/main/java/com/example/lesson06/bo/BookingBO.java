package com.example.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson06.dao.BookingDAO;
import com.example.lesson06.model.Booking;

@Service
public class BookingBO {
	@Autowired
	BookingDAO bookingDAO;
	
	public List<Booking> selectAll() {
		return bookingDAO.selectAll();
	}
}
