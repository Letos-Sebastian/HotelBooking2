package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.Room;
import com.example.hotelbooking2.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{

    private RoomRepository roomRepository;
    @Autowired
    public RoomServiceImpl(RoomRepository theRoomRepository){
        roomRepository = theRoomRepository;
    }
    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public void save(Room theRoom) {
        roomRepository.save(theRoom);
    }

    @Override
    public void delete(Room theRoom) {
        roomRepository.delete(theRoom);
    }
}
