package com.example.jobapp.review.service;

import com.example.jobapp.review.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAll(Long companyId);
    boolean create(Long companyId, Review review);
    Review getReview(Long companyId, Long reviewId);
    boolean update(Long companyId, Long reviewId, Review updatedReview);

    boolean delete(Long companyId, Long reviewId);
}
