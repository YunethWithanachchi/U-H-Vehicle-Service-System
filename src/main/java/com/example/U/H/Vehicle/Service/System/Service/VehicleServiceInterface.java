package com.example.U.H.Vehicle.Service.System.Service;

import com.example.U.H.Vehicle.Service.System.Model.VehicleService;

import java.util.List;

public interface VehicleServiceInterface {
    VehicleService saveService(VehicleService vehicleService);
    List<VehicleService> getAllServices();
    VehicleService getServiceById(long id);
    VehicleService updateService(VehicleService vehicleService, long id);
    void deleteService(long id) throws Throwable;
}
