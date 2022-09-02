package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.Hotel;
import com.example.hotelbooking2.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{


    // Constructor injection
    private HotelRepository hotelRepository;
    @Autowired
    public HotelServiceImpl(HotelRepository theHotelRepository){ hotelRepository = theHotelRepository; }


    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel findByHotelName(String hotelName) {
        return hotelRepository.findByHotelName(hotelName);
    }

    @Override
    public void save(Hotel theHotel) {
        hotelRepository.save(theHotel);
    }

    @Override
    public void delete(Hotel theHotel) {
        hotelRepository.delete(theHotel);
    }

    public Integer getUserIdByEmailAndPassword(String email, String password) {
        return hotelRepository.getIdFromUsersTable(email, password);
    }
}
