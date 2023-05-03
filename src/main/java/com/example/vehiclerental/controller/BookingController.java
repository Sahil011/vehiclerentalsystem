package com.example.vehiclerental.controller;

import com.example.vehiclerental.Model.Booking;
import com.example.vehiclerental.Model.Vehicle;
import com.example.vehiclerental.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    public BookingService bookingService;

    @PostMapping(value ="/book")
    @ResponseBody
    public Booking bookVehicle(@RequestParam Vehicle vehicle){

        return new Booking();
    }
}
