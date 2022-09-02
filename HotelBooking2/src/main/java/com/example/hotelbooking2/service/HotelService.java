package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    public List<Hotel> findAll();
    public Hotel findByHotelName(String hotelName);
    public void save(Hotel theHotel);
    public void delete(Hotel theHotel);
}
