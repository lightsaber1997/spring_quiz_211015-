package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.SellerBO;
import com.example.lesson04.model.Seller;

@RequestMapping("/lesson04/quiz01")
@Controller
public class Lesson04Quiz01Controller {
	@Autowired
	SellerBO sellerBO;
	
	@PostMapping("/add_seller")
	public String addSeller(
			@RequestParam("nickname") String nickname,
			@RequestParam("temperature") double temperature,
			@RequestParam("profileImageUrl") String profileImageUrl) {
		sellerBO.addSeller(nickname, temperature, profileImageUrl);
		return "lesson04/afterAddSeller";
	}
	
	@RequestMapping("/seller_info")
	public String getSellerInfo(Model model) {
		Seller seller = sellerBO.getSeller();
		model.addAttribute("title", "판매자정보");
		model.addAttribute("seller", seller);
		return "lesson04/seller_info";
	}
	
	@RequestMapping("/add")
	public String addSellerView() {
		return "lesson04/addSeller";
	}
}
