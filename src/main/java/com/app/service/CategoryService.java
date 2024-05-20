package com.app.service;

import java.util.List;

import com.app.Exception.RestaurantException;
import com.app.model.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
	
	public Category createCategory (String name,Long userId) throws RestaurantException;
	public List<Category> findCategoryByRestaurantId(Long restaurantId) throws RestaurantException;
	public Category findCategoryById(Long id) throws RestaurantException;

}
