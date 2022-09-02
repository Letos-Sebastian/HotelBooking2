package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {

    public List<Room> findAll();
    public void save(Room theRoom);
    public void delete(Room theRoom);
}
