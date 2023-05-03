package com.example.vehiclerental.repository;

import com.example.vehiclerental.Model.Vehicle;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class VehiclesRepo {

    private List<Vehicle> vehicles = new ArrayList<>();

    public Vehicle addVehicle(Vehicle vehicle) throws Exception {
        //validate if vehicle exists
        for(Vehicle presentVehicle : vehicles){
            if(presentVehicle.equals(vehicle))
                throw new Exception("vehicle already present");
        }
        vehicle.setId(vehicles.size()+1);
        vehicles.add(vehicle);
        return vehicle;
    }

    public Vehicle updateVehicle(Vehicle vehicle){
        //validate and update
        return vehicle;
    }


}
