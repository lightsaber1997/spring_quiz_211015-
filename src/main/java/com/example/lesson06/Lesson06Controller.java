package com.example.lesson06;

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

import com.example.lesson06.bo.UrlBO;
import com.example.lesson06.model.Url;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {
	@Autowired
	UrlBO urlBO;
	
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
}
