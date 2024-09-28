package com.lcwd.rating.service.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "ratings")
public class Rating {
	@Id
	private ObjectId id;
	private Long userId;
	private Long hotelId;
	private Integer rating;
	private String feedback;
}