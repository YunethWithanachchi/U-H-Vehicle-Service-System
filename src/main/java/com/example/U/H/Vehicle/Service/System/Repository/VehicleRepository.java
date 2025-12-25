package com.example.U.H.Vehicle.Service.System.Repository;

import com.example.U.H.Vehicle.Service.System.Model.VehicleService;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface VehicleRepository extends JpaRepository<VehicleService,Long> {
    List<VehicleService> findByServicedDate(Date servicedDate);
}
