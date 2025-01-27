package com.abhinav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhinav.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
