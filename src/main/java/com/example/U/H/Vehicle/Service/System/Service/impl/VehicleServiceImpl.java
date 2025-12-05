package com.example.U.H.Vehicle.Service.System.Service.impl;

import com.example.U.H.Vehicle.Service.System.Model.VehicleService;
import com.example.U.H.Vehicle.Service.System.Repository.VehicleRepository;
import com.example.U.H.Vehicle.Service.System.Service.VehicleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleServiceInterface {
    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public VehicleService saveService(VehicleService vehicleService) {
        return (VehicleService) vehicleRepository.save(vehicleService);
    }

    @Override
    public List getAllServices() {
        return vehicleRepository.findAll();
    }

    @Override
    public VehicleService getServiceById(long id) {
        Optional<VehicleService> vehicleService = vehicleRepository.findById(id);
        if (vehicleService.isPresent()){
            return vehicleService.get();
        }else {
            throw new RuntimeException();
        }
    }

    @Override
    public VehicleService updateService(VehicleService vehicleService, long id) {
        VehicleService existingVehicleService = vehicleRepository.findById(id).orElseThrow(
                ()->new RuntimeException()
        );
        existingVehicleService.setVehicleNo(vehicleService.getVehicleNo());
        existingVehicleService.setType(vehicleService.getType());
        existingVehicleService.setServicedDate(vehicleService.getServicedDate());
        vehicleRepository.save(existingVehicleService);
        return existingVehicleService;
    }

    @Override
    public void deleteService(long id) throws Throwable {
        vehicleRepository.findById(id). orElseThrow(()-> new RuntimeException());
        vehicleRepository.deleteById(id);
    }
}
