package com.jpa.mapping.service;

import com.jpa.mapping.entity.Owner;
import com.jpa.mapping.entity.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehicleInterface {
    public List<Vehicle> getAllVehicles();

    Vehicle createVehicle(Vehicle vehicle);

     Owner createOwner(Owner owner) ;

}
