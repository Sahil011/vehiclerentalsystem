package com.example.vehiclerental.serviceImpl;


import com.example.vehiclerental.Model.Vehicle;
import com.example.vehiclerental.Model.VehicleType;
import com.example.vehiclerental.repository.BookingRepo;
import com.example.vehiclerental.repository.VehiclesRepo;
import com.example.vehiclerental.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    public VehiclesRepo vehicleRepo;

    @Autowired
    public BookingRepo bookingRepo;

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        //TODO validations
        try {
            return vehicleRepo.addVehicle(vehicle);
        }catch(Exception ex){
            return new Vehicle();
        }
    }

    @Override
    public List<Vehicle> getAvailableVehicles(Date from, Date to, VehicleType type) {
        //TODO validations
        return bookingRepo.getAvailableVehicles(from, to, type);
    }
}
