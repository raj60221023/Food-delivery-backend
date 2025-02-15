package com.abhinav.service;

import java.util.List;

import com.abhinav.Exception.FoodException;
import com.abhinav.Exception.RestaurantException;
import com.abhinav.model.IngredientCategory;
import com.abhinav.model.IngredientsItem;
import com.abhinav.model.Food;
import com.abhinav.repository.IngredientsCategoryRepository;

public interface IngredientsService {
	
	public IngredientCategory createIngredientsCategory(
			String name,Long restaurantId) throws RestaurantException;

	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;
	
	public List<IngredientsItem> findRestaurantsIngredients(
			Long restaurantId);

	
	public IngredientsItem createIngredientsItem(Long restaurantId, 
			String ingredientName,Long ingredientCategoryId) throws Exception;

	public IngredientsItem updateStoke(Long id) throws Exception;
	
}
