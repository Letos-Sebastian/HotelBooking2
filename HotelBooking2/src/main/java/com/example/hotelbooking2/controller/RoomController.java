package com.example.hotelbooking2.controller;

import com.example.hotelbooking2.entity.Room;
import com.example.hotelbooking2.service.RoomServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomController {

    private RoomServiceImpl roomService;
    public RoomController(RoomServiceImpl theRoomService){
        roomService = theRoomService;
    }

    /// get all rooms
    @GetMapping("/rooms")
    public List<Room> findAll(){
        return roomService.findAll();
    }

    /// add a room
    @PostMapping("/room/add")
    public Room addRoom(@RequestBody Room theRoom){
        theRoom.setRoom_id(0);
        roomService.save(theRoom);
        return theRoom;
    }

}
