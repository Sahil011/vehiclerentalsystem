package com.example.vehiclerental.controller;


import com.example.vehiclerental.Model.Vehicle;
import com.example.vehiclerental.Model.VehicleType;
import com.example.vehiclerental.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    public VehicleService vehicleService;
    //TODO :-> CHANGE TO(ADD) REQUEST DTO TO ENDPOINT
    @PostMapping(value = "add/vehicle")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){

        return vehicleService.addVehicle(vehicle);
    }

    @GetMapping(value ="/available/Vehicle")
    @ResponseBody
    public List<Vehicle> getAvailableVehicle(@RequestParam Date from, @RequestParam Date to, @RequestParam String vehicleType){

        return vehicleService.getAvailableVehicles(from, to , VehicleType.valueOf(vehicleType));
    }
}
