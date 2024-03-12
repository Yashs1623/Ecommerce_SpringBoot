package com.yash.service;

import java.util.List;

import com.yash.exception.ProductException;
import com.yash.modal.Review;
import com.yash.modal.User;
import com.yash.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
