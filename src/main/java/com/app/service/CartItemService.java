package com.app.service;

import com.app.model.CartItem;
import org.springframework.stereotype.Service;

@Service
public interface CartItemService {
	
	public CartItem createCartItem(CartItem item);

}
