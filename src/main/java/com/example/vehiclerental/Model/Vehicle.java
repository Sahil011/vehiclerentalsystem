package com.example.vehiclerental.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.util.stream.Stream;

@Data
public class Vehicle implements Comparable<Vehicle>{

    private int id;
    private String vehicleNumber;
    private String description;
    private VehicleType type;
    private Integer distanceCovered;

    private VehicleState status;

    @Override
    public int compareTo(Vehicle o) {
        return this.getVehicleNumber().compareTo(o.getVehicleNumber());
    }


    public Boolean equals(Vehicle vehicle){
        if(this.getVehicleNumber().equals(vehicle.getVehicleNumber()))return true;
        return false;
    }



}
