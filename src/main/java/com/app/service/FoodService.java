package com.app.service;

import java.util.List;

import com.app.Exception.FoodException;
import com.app.Exception.RestaurantException;
import com.app.model.Category;
import com.app.model.Food;
import com.app.model.Restaurant;
import com.app.request.CreateFoodRequest;
import org.springframework.stereotype.Service;

@Service
public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
