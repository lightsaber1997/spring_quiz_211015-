package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Controller
public class quiz01 {
	@ResponseBody
	@RequestMapping("/lesson01/quiz01/1")
	public String print_string() {
		String text = "<h1>테스트 프로젝트 완성</h1>"
				+ "<h3>해당 프로젝트를 통해서 문제 풀이를 진행합니다. </h3>";
		return text;
	}
	
	@ResponseBody
	@RequestMapping("/lesson01/quiz01/2")
	public Map<String, Object> print_map() {
		Map<String, Object> map = new HashMap<>();
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 85);
		return map;
	}
	
}
