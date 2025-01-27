package com.abhinav.service;

import com.abhinav.Exception.CartException;
import com.abhinav.Exception.CartItemException;
import com.abhinav.Exception.FoodException;
import com.abhinav.Exception.UserException;
import com.abhinav.model.Cart;
import com.abhinav.model.CartItem;
import com.abhinav.model.Food;
import com.abhinav.model.User;
import com.abhinav.request.AddCartItemRequest;
import com.abhinav.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
