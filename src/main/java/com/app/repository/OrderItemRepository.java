package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.OrderItem;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
