package com.example.U.H.Vehicle.Service.System.Controller;

import com.example.U.H.Vehicle.Service.System.Model.VehicleService;
import com.example.U.H.Vehicle.Service.System.Repository.VehicleRepository;
import com.example.U.H.Vehicle.Service.System.Service.VehicleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/vehicleServices")
@CrossOrigin(origins = "*")
public class VehicleController {
    @Autowired
    private VehicleServiceInterface vehicleServiceInterface;

    private final VehicleRepository vehicleRepository;

    public VehicleController(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @GetMapping("/year/{year}")
    public List<VehicleService>getVehiclesByServiceYear(@PathVariable Date year){
        return vehicleRepository.findByServicedDate(year);
    }

    @GetMapping("/type/{serviceId}")
    public String getVehicleType(@PathVariable Long serviceId){
        return vehicleRepository.findVehicleTypeByServiceId(serviceId);
    }

    @DeleteMapping("/year/{year}")
    public String removeVehicleRecords(@PathVariable Date year){
        vehicleRepository.removeByServicedDate(year);
        return "All vehicle service records for year " + year + " have been deleted.";
    }
}
