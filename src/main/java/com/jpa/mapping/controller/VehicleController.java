package com.jpa.mapping.controller;

import com.jpa.mapping.entity.Owner;
import com.jpa.mapping.entity.Vehicle;
import com.jpa.mapping.service.VehicleInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/vehicle")
public class VehicleController {

    @Autowired
    private VehicleInterface vehicleOwnerService;

    // Get all vehicles
    @GetMapping("/vehicles")
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        List<Vehicle> vehicles = vehicleOwnerService.getAllVehicles();
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }

    // Create a new vehicle
    @PostMapping("/vehicles")
    public ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle) {
        Vehicle createdVehicle = vehicleOwnerService.createVehicle(vehicle);
        return new ResponseEntity<>(createdVehicle, HttpStatus.CREATED);
    }


    @PostMapping("/owner")
    public ResponseEntity<Owner> createOwner(@RequestBody Owner owner) {
        return new ResponseEntity<>(vehicleOwnerService.createOwner(owner), HttpStatus.CREATED);
    }

}
