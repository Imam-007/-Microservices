package com.imam.rating.services;

import com.imam.rating.models.Rating;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getAllRatingByUserId(String userId);

    List<Rating> getAllRatingByHotelId(String hotelId);
}
