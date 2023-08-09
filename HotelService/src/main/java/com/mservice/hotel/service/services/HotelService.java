package com.mservice.hotel.service.services;

import com.mservice.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel create(Hotel hotel);

    //Get All hotels
    List<Hotel> getAllHotels();

    //Get Hotel by id
    Hotel getHotel(String id);

}
