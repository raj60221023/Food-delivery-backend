package com.abhinav.service;

import java.util.List;

import com.abhinav.Exception.ReviewException;
import com.abhinav.model.Review;
import com.abhinav.model.User;
import com.abhinav.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
