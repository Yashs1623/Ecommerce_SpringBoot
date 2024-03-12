package com.yash.service;

import java.util.List;

import com.yash.exception.ProductException;
import com.yash.modal.Rating;
import com.yash.modal.User;
import com.yash.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
