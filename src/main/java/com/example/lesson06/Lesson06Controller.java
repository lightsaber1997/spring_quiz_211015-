package com.example.lesson06;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson06.bo.BookingBO;
import com.example.lesson06.bo.UrlBO;
import com.example.lesson06.model.Booking;
import com.example.lesson06.model.Url;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {
	@Autowired
	UrlBO urlBO;
	@Autowired
	BookingBO bookingBO;
	
	@RequestMapping("/quiz01_add_view")
	public String addView() {
		return "lesson06/add_view";
	}
	
	@ResponseBody
	@PostMapping("/quiz01_add") 
	public Map<String, Boolean> add(
			@RequestParam("name") String name,
			@RequestParam("url") String url,
			@RequestParam("no_duplicate") Boolean no_duplicate
			) {
		Map<String, Boolean> result = new HashMap<>();
		boolean flag = false;
		if (no_duplicate) {
			urlBO.insertUrl(name, url);
			flag = true;
		}
		
		
		result.put("success", flag);
		return result;
	}
	
	
	@RequestMapping("/quiz01_check_duplicate")
	@ResponseBody
	public Map<String, Boolean> checkDuplicate(
			@RequestParam("url") String url
			) {
			// search for duplicate name
			List<Url> searchResult = urlBO.selectByUrl(url);
			boolean flag = false;
			if (searchResult.size() > 0) {
				flag = true;
			}
			Map<String, Boolean> result = new HashMap<>();
			result.put("exists_duplicate", flag);
			return result;
	}
	
	@RequestMapping("/quiz01_delete")
	@ResponseBody
	public Map<String, List<String>> delete(
			@RequestParam("id") int id
			) {
		urlBO.deleteById(id);
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<Url> urls = urlBO.selectAll();
		for (Url url: urls) {
			List<String> temp = new ArrayList<>();
			temp.add(url.getName());
			temp.add(url.getUrl());
			map.put(Integer.toString(url.getId()), temp);
		}
		
		return map;
	}
	
	@RequestMapping("/quiz01_table")
	public String tableView(Model model) {
		List<Url> result = urlBO.selectAll();
		model.addAttribute("result", result);
		return "lesson06/table";
	}
	
	@RequestMapping("/quiz03_main")
	public String mainView(Model model) {
		return "lesson06/quiz03/main_view";
	}
	
	
	@PostMapping("/quiz03_check_reservation")
	@ResponseBody
	public Map<String, String> checkReservation(
			@RequestParam("name") String name,
			@RequestParam("phoneNumber") String phoneNumber) {
		Map<String, String> map = new HashMap<>();
		List<Booking> searchResult = bookingBO.selectByNameAndPhoneNumber(name, phoneNumber);
		if (searchResult.size() > 0) {
			Booking booking = searchResult.get(0);
			map.put("exist", "true");
			map.put("name", booking.getName());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date_ = sdf.format(booking.getDate());
			map.put("date", date_);
			String num_days_ = Integer.toString(booking.getNum_days());
			map.put("num_days", num_days_ );
			String num_guests_ = Integer.toString(booking.getNum_guests());
			map.put("num_guests", num_guests_);
			map.put("status", booking.getStatus());
		}
		else {
			map.put("exist", "false");
		}
		return map;
	}
	
	@RequestMapping("/quiz03_index")
	public String index_view(Model model) {
		List<Booking> bookings = bookingBO.selectAll();
		model.addAttribute("result", bookings);
		return "lesson06/quiz03/index_view";
	}
	
	
	
	@RequestMapping("/quiz03_reservation_view")
	public String reservation_view() {
		return "lesson06/quiz03/reservation_view";
	}
	
	@RequestMapping("/quiz03_layout")
	public String testLayout(Model model) {
		return "lesson06/quiz03/layout_main";
	}
	
	
	@PostMapping("/quiz03_reservation")
	@ResponseBody
	public Map<String, String> reservation(
			@RequestParam("name") String name,
			@RequestParam("date") String date,
			@RequestParam("num_days") int num_days,
			@RequestParam("num_guests") int num_guests,
			@RequestParam("phoneNumber") String phoneNumber
			) {
		Map<String, String> map = new HashMap<>();
		bookingBO.insert(name, date, num_days, num_guests, phoneNumber, "확정");
		map.put("success", "true");
		return map;
	}
	
	@PostMapping("/quiz03_delete_by_id")
	@ResponseBody
	public String deleteById(
			@RequestParam("id") int id) {
		bookingBO.deleteById(id);
		return "success";
	}
}
