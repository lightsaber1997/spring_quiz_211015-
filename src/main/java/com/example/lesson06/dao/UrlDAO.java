package com.example.lesson06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson06.model.Url;

@Repository
public interface UrlDAO {
	public void insertUrl(
			@Param("name") String name, 
			@Param("url") String url);
	public List<Url> selectAll();
	public List<Url> selectByUrl(
			String url);
	public void deleteById(int id);
}
