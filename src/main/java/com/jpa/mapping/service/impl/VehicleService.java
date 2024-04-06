package com.jpa.mapping.service.impl;

import com.jpa.mapping.dao.OwnerRepository;
import com.jpa.mapping.dao.VehicleRepository;
import com.jpa.mapping.entity.Owner;
import com.jpa.mapping.entity.Vehicle;
import com.jpa.mapping.service.VehicleInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements VehicleInterface {
    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    // Get all vehicles
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // Create a new vehicle
    public Vehicle createVehicle(Vehicle vehicle) {
//        ownerRepository.save(vehicle.getOwner());
        return vehicleRepository.save(vehicle);
    }

    public Owner createOwner(Owner owner) {
       return ownerRepository.save(owner);
    }


}
