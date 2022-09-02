package com.example.hotelbooking2.entity;


import javax.persistence.*;

@Entity
@Table(name="Reservation")
public class Reservation {

    ////////////////////////////// Define Fields //////////////////////////////

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservation_id;

    //@OneToOne(cascade=CascadeType.ALL)
    //private User user;
    @Column(name="userId", nullable = false)
    private Integer userId;


    @Column(name="hotelName", nullable = false)
    private String hotelName;

    @Column(name="typeOfRoom", nullable = false)
    private String typeOfRoom;

    @Column(name="typeOfView", nullable = false)
    private String typeOfView;

    //@Column(name="haveMeal", nullable = false)
    //private boolean haveMeal;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name="reservationPrice")
    //private Room room;

    ////////////////////////////// Define Constructors //////////////////////////////

    ////////// No-arg //////////
    public Reservation(){}

    ////////// With arg //////////

    public Reservation(Integer userId, String hotelName, String typeOfRoom, String typeOfView) {
        this.userId = userId;
        this.hotelName = hotelName;
        this.typeOfRoom = typeOfRoom;
        this.typeOfView = typeOfView;
    }


    ////////////////////////////// Setter and Getter //////////////////////////////

    public Integer getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(Integer reservation_id) {
        this.reservation_id = reservation_id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public String getTypeOfView() {
        return typeOfView;
    }

    public void setTypeOfView(String typeOfView) {
        this.typeOfView = typeOfView;
    }



    /*public boolean isHaveMeal() {
        return haveMeal;
    }

    public void setHaveMeal(boolean haveMeal) {
        this.haveMeal = haveMeal;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }*/

    ////////////////////////////// Define toString() //////////////////////////////


    @Override
    public String toString() {
        return "Reservation{" +
                "reservation_id=" + reservation_id +
                ", userId=" + userId +
                ", hotelName='" + hotelName + '\'' +
                ", typeOfRoom='" + typeOfRoom + '\'' +
                ", typeOfView='" + typeOfView + '\'' +
                '}';
    }
}
