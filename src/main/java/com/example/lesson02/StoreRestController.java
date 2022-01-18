package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.StoreBO;
import com.example.lesson02.model.Store;

@RequestMapping("/lesson02/quiz01")
@RestController
public class StoreRestController {
	@Autowired
	StoreBO storeBO;
	
	@RequestMapping("/1")
	public List<Store> ex01() {
		return storeBO.getStoreList();
	}
}
