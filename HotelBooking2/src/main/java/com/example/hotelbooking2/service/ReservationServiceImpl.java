package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.Reservation;
import com.example.hotelbooking2.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{

    private ReservationRepository reservationRepository;
    @Autowired
    public ReservationServiceImpl(ReservationRepository theReservationRepository){
        reservationRepository=theReservationRepository;
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public void save(Reservation theReservation) {
        reservationRepository.save(theReservation);
    }

    @Override
    public void delete(Reservation theReservation) {
        reservationRepository.delete(theReservation);
    }
}
