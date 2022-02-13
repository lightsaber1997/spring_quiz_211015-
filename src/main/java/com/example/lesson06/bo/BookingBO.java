package com.example.lesson06.bo;

import java.util.ArrayList;
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
	
	public void insert(String name, String date, 
			int num_days, int num_guests, 
			String phoneNumber, String status) {
		bookingDAO.insert(name, date, num_days, num_guests, phoneNumber, status);
	}
	
	public List<Booking> selectByPhoneNumber(String phoneNumber) {
		return bookingDAO.selectByPhoneNumber(phoneNumber);
	}
	
	public List<Booking> selectByNameAndPhoneNumber(String name, String phoneNumber) {
		List<Booking> result = this.selectByPhoneNumber(phoneNumber);
		List<Booking> result2 = new ArrayList<>();
		for (Booking booking: result) {
			if (booking.getName().equals(name)) {
				result2.add(booking);
			}
		}
		
		return result2;
	}
	
	public void deleteById(int id) {
		bookingDAO.deleteById(id);
	}
}
