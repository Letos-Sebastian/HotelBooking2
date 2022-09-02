package com.example.hotelbooking2.entity;

import javax.persistence.*;

@Entity
@Table(name="hotels")
public class Hotel {

    ////////////////////////////// Define Fields //////////////////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hotelId")
    private Integer hotelId;
    @Column(name="hotelName",unique = true)
    private String hotelName;

    //@ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "user_id")
    //private User managerId;

    ////////////////////////////// Define Constructors //////////////////////////////

    ////////// No-arg //////////
    public Hotel(){}

    ////////// With arg //////////

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }


    ////////////////////////////// Setter and Getter //////////////////////////////

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }




    ////////////////////////////// Define toString() //////////////////////////////


    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                '}';
    }
}
