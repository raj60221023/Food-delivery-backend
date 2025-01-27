package com.abhinav.service;

import java.util.List;

import com.abhinav.model.Notification;
import com.abhinav.model.Order;
import com.abhinav.model.Restaurant;
import com.abhinav.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
