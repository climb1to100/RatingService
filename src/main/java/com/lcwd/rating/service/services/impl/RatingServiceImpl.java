package com.lcwd.rating.service.services.impl;

import com.lcwd.rating.service.entities.Rating;
import com.lcwd.rating.service.repositories.RatingRepository;
import com.lcwd.rating.service.services.RatingService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ratingservice")
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public Rating getRatingById(ObjectId ratingId) {
        Optional<Rating> ratingOp=ratingRepository.findById(ratingId);
        return ratingOp.orElse(null);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(Long userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(Long hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
