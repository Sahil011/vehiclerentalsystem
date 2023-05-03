package com.example.vehiclerental.Model;

import lombok.Data;

import java.util.Date;

@Data
public class Booking {

    private int id;
    private Vehicle vehicle;
    private User user;
    private Date pickupTime;
    private Date dropTime;
    private Date createdOn;
    private Adress adress;
    private BookingStatus status;


}
