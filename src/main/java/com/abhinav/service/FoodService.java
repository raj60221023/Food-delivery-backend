package com.abhinav.service;

import java.util.List;

import com.abhinav.Exception.FoodException;
import com.abhinav.Exception.RestaurantException;
import com.abhinav.model.Category;
import com.abhinav.model.Food;
import com.abhinav.model.Restaurant;
import com.abhinav.request.CreateFoodRequest;

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
