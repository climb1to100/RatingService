package com.lcwd.rating.service.repositories;

import com.lcwd.rating.service.entities.Rating;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, ObjectId> {

    List<Rating> findByUserId(Long userId);

    List<Rating> findByHotelId(Long hotelId);
}
