package com.example.lesson02.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson02.model.Store;

@Repository
public interface StoreDAO {
	public List<Store> selectStoreList();
	public Store selectById(@Param("id")int id);
}
