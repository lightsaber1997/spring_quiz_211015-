package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.RealtorDAO;
import com.example.lesson04.model.Realtor;

@Service
public class RealtorBO {
	@Autowired
	private RealtorDAO realtorDAO;
	
	
	public void insertRealtor(Realtor realtor) {
		realtorDAO.insertRealtor(realtor);
	}
	
	public Realtor searchById(int id) {
		return realtorDAO.selectById(id);
	}
}
