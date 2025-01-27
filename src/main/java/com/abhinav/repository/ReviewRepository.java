package com.abhinav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhinav.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
