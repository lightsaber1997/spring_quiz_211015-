package com.example.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.example.lesson04.model.Realtor;

@Repository
public interface RealtorDAO {
	public void insertRealtor(Realtor realtor);
	public Realtor selectById(int id);
}
