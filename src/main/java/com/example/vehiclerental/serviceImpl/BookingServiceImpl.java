package com.example.vehiclerental.serviceImpl;

import com.example.vehiclerental.Model.Booking;
import com.example.vehiclerental.Model.BookingStatus;
import com.example.vehiclerental.Model.Vehicle;
import com.example.vehiclerental.Model.VehicleType;
import com.example.vehiclerental.repository.BookingRepo;
import com.example.vehiclerental.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    @Override
    public Booking bookVehicle(Booking bookingDto) {
            // validation and bussiness logics
        try {
           return bookingRepo.createBooking(bookingDto);
        }catch (Exception ex){
            bookingDto.setStatus(BookingStatus.FAILED);
            return bookingDto;
        }
    }
}
