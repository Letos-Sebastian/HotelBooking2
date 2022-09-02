package com.example.hotelbooking2.controller;

import com.example.hotelbooking2.entity.*;
import com.example.hotelbooking2.service.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservationController {

    private ReservationServiceImpl reservationService;
    @Autowired
    public ReservationController(ReservationServiceImpl theReservationService){
        reservationService=theReservationService;
    }

    /// get all reservations
    @GetMapping("/reservations")
    public List<Reservation> findAll(){
        return reservationService.findAll();
    }

    /// add a reservation
    @PostMapping("/reservation/add")
    public Reservation addReservation(
            @RequestBody Reservation theReservation
    ){
        Room r = new Room("Single",5,500);
        theReservation.setReservation_id(0);
        theReservation.setTypeOfRoom(r.getTypeOfRoom());
        reservationService.save(theReservation);
        return theReservation;
    }
}
