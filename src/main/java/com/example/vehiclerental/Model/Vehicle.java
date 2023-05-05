package com.example.vehiclerental.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.util.Objects;
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


    @Override
    public boolean equals(Object vehicle){
        if(Objects.isNull(vehicle))return false;
        if(vehicle.getClass()!=this.getClass())return false;
        if(this.getVehicleNumber().equals(((Vehicle)vehicle).getVehicleNumber()))return true;
        return false;
    }



}
