package com.example.hotelbooking2.entity;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="rooms")
public class Room {

    ////////////////////////////// Define Fields //////////////////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomId;
    @Column(name="typeOfRoom")
    private String typeOfRoom;

    @Column(name="numberOfRooms")
    private int numberOfRooms;

    @Column(name="priceRoom")
    private double priceRoom;

    ////////////////////////////// Define Constructors //////////////////////////////

    ////////// No-arg //////////
    public Room(){}

    ////////// With arg //////////
    public Room(String typeOfRoom, int numberOfRooms, double priceRoom) {
        this.typeOfRoom = typeOfRoom;
        this.numberOfRooms = numberOfRooms;
        this.priceRoom = priceRoom;
    }

    ////////////////////////////// Setter and Getter //////////////////////////////
    public int getRoom_id() {
        return roomId;
    }

    public void setRoom_id(int room_id) {
        this.roomId = room_id;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }

    ////////////////////////////// Define toString() //////////////////////////////
    @Override
    public String toString() {
        return "Rooms{" +
                "room_id=" + roomId +
                ", typeOfRoom='" + typeOfRoom + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", priceRoom=" + priceRoom +
                '}';
    }
}
