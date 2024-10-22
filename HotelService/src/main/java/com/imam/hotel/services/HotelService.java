package com.imam.hotel.services;

import com.imam.hotel.models.Hotel;

import java.util.List;

public interface HotelService {

    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotelList();

    Hotel getHotel(String id);
}
