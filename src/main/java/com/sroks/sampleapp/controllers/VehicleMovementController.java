package com.sroks.sampleapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMovementController {
    @GetMapping("/vehicleMovements")
    public String getVehicleMovements() {
        return "vehicleMovement";
    }
}
