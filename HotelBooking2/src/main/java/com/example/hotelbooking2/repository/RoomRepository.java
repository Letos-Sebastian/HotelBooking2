package com.example.hotelbooking2.repository;

import com.example.hotelbooking2.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Integer> {
}
