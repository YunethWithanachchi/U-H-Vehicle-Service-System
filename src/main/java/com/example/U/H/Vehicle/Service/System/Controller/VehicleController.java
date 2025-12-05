package com.example.U.H.Vehicle.Service.System.Controller;

import com.example.U.H.Vehicle.Service.System.Model.VehicleService;
import com.example.U.H.Vehicle.Service.System.Service.VehicleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicleServices")
@CrossOrigin(origins = "*")
public class VehicleController {
    @Autowired
    private VehicleServiceInterface vehicleServiceInterface;
    @PostMapping
    public ResponseEntity<VehicleService>saveService(@RequestMapping )
}
