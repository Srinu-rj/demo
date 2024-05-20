package com.app.service;

import com.app.model.OrderItem;
import org.springframework.stereotype.Service;

@Service
public interface OrderItemService {
	
	public OrderItem createOrderIem (OrderItem orderItem);

}
