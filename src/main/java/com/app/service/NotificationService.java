package com.app.service;

import java.util.List;

import com.app.model.Notification;
import com.app.model.Order;
import com.app.model.Restaurant;
import com.app.model.User;
import org.springframework.stereotype.Service;

@Service
public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
