package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.Reservation;
import com.example.hotelbooking2.entity.View;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {

    public List<Reservation> findAll();
    public void save(Reservation theReservation);
    public void delete(Reservation theReservation);
}
