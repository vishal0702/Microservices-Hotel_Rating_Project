package com.mservice.rating.service.services;

import com.mservice.rating.service.entities.Rating;
import java.util.List;

public interface RatingService {

    //Create
    Rating create(Rating rating);

    //Get all the Ratings
    List<Rating> getRatings();

    //Get all rating by userId
    List<Rating> getRatingsByUserId(String userId);

    //Get all ratings by hotelId
    List<Rating> getRatingsByHotelId(String hotelId);

}
