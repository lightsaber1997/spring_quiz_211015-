package com.example.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson06.dao.UrlDAO;
import com.example.lesson06.model.Url;

@Service
public class UrlBO {
	@Autowired
	UrlDAO urlDAO;
	
	public void insertUrl(String name, String url) {
		urlDAO.insertUrl(name, url);
	}
	public List<Url> selectAll() {
		return urlDAO.selectAll();
	}
	
	public void deleteById(int id) {
		urlDAO.deleteById(id);
	}
	
	public List<Url> selectByUrl(String url) {
		return urlDAO.selectByUrl(url);
	}
}
