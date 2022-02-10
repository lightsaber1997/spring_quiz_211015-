package com.example.lesson05.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson05.dao.NewReviewDAO;
import com.example.lesson05.model.NewReview;

@Service
public class NewReviewBO {
	@Autowired
	private NewReviewDAO newReviewDAO;
	public List<NewReview> selectByStoreId(int storeId) {
		return newReviewDAO.selectByStoreId(storeId);
	}
}
