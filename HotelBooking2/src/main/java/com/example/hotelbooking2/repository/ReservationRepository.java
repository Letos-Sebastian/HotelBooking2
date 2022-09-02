package com.example.hotelbooking2.repository;

import com.example.hotelbooking2.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
