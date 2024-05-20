package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.CartItem;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
