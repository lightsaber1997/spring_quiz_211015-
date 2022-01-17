package com.example.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@Controller
public class quiz02 {
	@RequestMapping("/1")
	@ResponseBody
	public List<Map<String, Object>> problem1() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<>();
		map.put("rate", 15);
		map.put("director", "봉준호");
		map.put("time", 131);
		map.put("title", "기생충");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate", 0);
		map.put("director", "로베르토 베니니");
		map.put("time", 116);
		map.put("title", "인생은 아름다워");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate", 12);
		map.put("director", "크리스토퍼 놀란");
		map.put("time", 147);
		map.put("title", "인셉션");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate", 19);
		map.put("director", "윤종빈");
		map.put("time", 133);
		map.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate", 15);
		map.put("director", "프란시스 로렌스");
		map.put("time", 137);
		map.put("title", "헝거게임");
		list.add(map);
		return list;
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public List<Post> problem2(){
		List<Post> list = new ArrayList<>();
		Post post = new Post("안녕하세요 가입인사 드립니다", "hagulu", "안녕하세요 가입했어요");
		list.add(post);
		post = new Post("헐 대박", "bada", "오늘 목요일이 있어... 금요일인줄");
		list.add(post);
		post = new Post("오늘 데이트 한 이야기 해드릴게요.", "dulum", "...");
		list.add(post);
		return list;
	}
	
	@RequestMapping("/3")
	@ResponseBody
	public ResponseEntity<Post> problem3() {
		Post post = new Post("안녕하세요 가입인사 드립니다", "hagulu", "안녕하세요 가입했어요");
		return new ResponseEntity<>(post, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
