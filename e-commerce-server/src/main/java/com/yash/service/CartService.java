package com.yash.service;

import com.yash.exception.ProductException;
import com.yash.modal.Cart;
import com.yash.modal.CartItem;
import com.yash.modal.User;
import com.yash.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
