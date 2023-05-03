package com.example.vehiclerental.service;



import com.example.vehiclerental.Model.Vehicle;
import com.example.vehiclerental.Model.VehicleType;

import java.util.Date;
import java.util.List;

public interface VehicleService {

    public Vehicle addVehicle(Vehicle vehicle);

    public List<Vehicle> getAvailableVehicles(Date from, Date to, VehicleType type);

}
