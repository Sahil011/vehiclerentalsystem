package com.example.vehiclerental.service;



import com.example.vehiclerental.Model.Vehicle;
import com.example.vehiclerental.Model.VehicleType;

import java.util.Date;
import java.util.List;

public interface BookingService {

    Vehicle getAvailableVehicle(Date from, Date to, List<VehicleType> type) throws Exception;
}
