package com.lcwd.rating.service.controller;

import com.lcwd.rating.service.entities.Rating;
import com.lcwd.rating.service.services.RatingService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping("/list")
    public ResponseEntity<List<Rating>> getAllHotels() {
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

    @GetMapping("/id")
    public ResponseEntity<Rating> getHotelById(@RequestParam("ratingId") ObjectId id) {
        return ResponseEntity.ok(ratingService.getRatingById(id));
    }

    @GetMapping("/by/user")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@RequestParam("userId") Long userId) {
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/by/hotel")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(@RequestParam("hotelId") Long hotelId) {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }

    @PostMapping("/save")
    public ResponseEntity<List<Rating>> saveRating(@RequestBody Rating rating) {
        Rating savedObject = ratingService.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(Collections.singletonList(savedObject));
    }



}
