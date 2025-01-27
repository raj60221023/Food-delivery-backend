package com.abhinav.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.abhinav.Exception.CartException;
import com.abhinav.Exception.OrderException;
import com.abhinav.Exception.RestaurantException;
import com.abhinav.Exception.UserException;
import com.abhinav.model.Order;
import com.abhinav.model.PaymentResponse;
import com.abhinav.model.User;
import com.abhinav.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
