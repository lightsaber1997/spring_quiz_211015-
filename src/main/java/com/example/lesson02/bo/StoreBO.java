package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.StoreDAO;
import com.example.lesson02.model.Store;

@Service
public class StoreBO {
	@Autowired
	private StoreDAO storeDAO;	
	
	public List<Store> getStoreList() {
		return storeDAO.selectStoreList();
	}
	
	public Store selectById(int id) {
		return storeDAO.selectById(id);
	}
	
}
