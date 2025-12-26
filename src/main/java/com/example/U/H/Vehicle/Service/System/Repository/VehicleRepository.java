package com.example.U.H.Vehicle.Service.System.Repository;

import com.example.U.H.Vehicle.Service.System.Model.VehicleService;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface VehicleRepository extends JpaRepository<VehicleService,Long> {
    List<VehicleService> findByServicedDate(Date servicedDate);

    @Query("SELECT v.type FROM VehicleService v WHERE v.serviceId = :serviceId")
    String findVehicleTypeByServiceId(@Param("serviceId") Long serviceId);

    @Transactional
    void removeByServicedDate(Date year);
}
