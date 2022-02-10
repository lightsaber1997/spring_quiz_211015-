package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson02.bo.StoreBO;
import com.example.lesson02.model.Store;
import com.example.lesson05.bo.MemberBO;
import com.example.lesson05.bo.NewReviewBO;
import com.example.lesson05.model.NewReview;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {
	@Autowired
	private MemberBO memberBO;
	@Autowired
	private StoreBO storeBO;
	@Autowired
	private NewReviewBO newReviewBO;
	
	@RequestMapping("/p1")
	public String prob1() {
		return "lesson05/p1";
	}
	
	@RequestMapping("/p2_0")
	public String prob2_0(Model model) {
		List<String> musicRanking = new ArrayList<>();
		
		musicRanking.add("강남스타일");
		musicRanking.add("벚꽃엔딩");
		musicRanking.add("좋은날");
		musicRanking.add("거짓말");
		musicRanking.add("보고싶다");
		
		model.addAttribute("musicRanking", musicRanking);
		
		return "lesson05/p2_0";
	}
	
	@RequestMapping("/p2_1")
	public String prob2_1(Model model) {
		List<Map<String, Object>> membership = new ArrayList<>();

		Map<String, Object> member = new HashMap<>();
		member.put("name", "손오공");
		member.put("phoneNumber", "010-1234-5678");
		member.put("grade", "VIP");
		member.put("point", 12040);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "저팔계");
		member.put("phoneNumber", "010-4321-1234");
		member.put("grade", "BASIC");
		member.put("point", 3420);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "사오정");
		member.put("phoneNumber", "010-8888-1111");
		member.put("grade", "GOLD");
		member.put("point", 1530);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "삼장");
		member.put("phoneNumber", "010-0000-1234");
		member.put("grade", "GOLD");
		member.put("point", 8450);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "우마왕");
		member.put("phoneNumber", "010-1111-2222");
		member.put("grade", "BASIC");
		member.put("point", 420);
		membership.add(member);
		
		model.addAttribute("membership", membership);
		return "lesson05/p2_1";
	}
	
	@RequestMapping("/p3_0")
	public String prob3_0(Model model) {
		List<Integer> candidates = new ArrayList<>();
		candidates.add(263001);
		candidates.add(173942); 
		candidates.add(563057); 
		
		double sum = 0;
		for (int e: candidates) {
			sum += e;
		}
		List<Double> percentages = new ArrayList<>();
		for (int i = 0; i < candidates.size(); i++) {
			percentages.add(candidates.get(i) / sum * 100);
		}
		List<String> percentages_ = new ArrayList<>();
		for (int i = 0; i < candidates.size(); i++) {
			String temp = String.format("%.0f", percentages.get(i));
			percentages_.add(temp + "%");
		}
		model.addAttribute("candidates", candidates);
		model.addAttribute("percentages_", percentages_);
		return "lesson05/p3_0";
	}
	
	@RequestMapping("/p4_0")
	public String prob4(Model model) {
		List<Member> members = memberBO.createMembers();
		model.addAttribute("members", members);
		return "lesson05/p4_0";
	}
	
	@RequestMapping("/p6_0")
	public String prob6(Model model) {
		List<Store> result = storeBO.getStoreList();
		model.addAttribute("result", result);
		return "lesson05/p6_index";
	}
	
	@GetMapping("/p6_1")
	public String prob6_1(
			@RequestParam("storeId") int storeId,
			Model model) {
		List<NewReview> result =  newReviewBO.selectByStoreId(storeId);
		Store store = storeBO.selectById(storeId);
		model.addAttribute("store", store);
		model.addAttribute("result", result);
		return "lesson05/p6_review";
	}
	

}
