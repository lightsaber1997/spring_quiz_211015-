package com.example.lesson05.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson05.model.NewReview;

@Repository
public interface NewReviewDAO {
	public List<NewReview> selectByStoreId(
			@Param("storeId") int storeId);
}
