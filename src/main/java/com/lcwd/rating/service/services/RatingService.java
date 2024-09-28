package com.lcwd.rating.service.services;

import com.lcwd.rating.service.entities.Rating;
import org.bson.types.ObjectId;

import java.util.List;

public interface RatingService {

   Rating createRating(Rating rating);

   Rating getRatingById(ObjectId ratingId);

   List<Rating> getAllRatings();

   List<Rating> getRatingByUserId(Long userId);

   List<Rating> getRatingByHotelId(Long hotelId);

}
