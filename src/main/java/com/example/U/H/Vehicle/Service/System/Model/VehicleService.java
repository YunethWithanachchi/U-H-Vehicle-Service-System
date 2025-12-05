package com.example.U.H.Vehicle.Service.System.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "VehicleService")
public class VehicleService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;
    @Column(name = "vehicle_No",nullable = false)
    private Long vehicleNo;
    @Column(name = "type",nullable = false)
    private String type;
    @Column(name = "service_Date",nullable = false)
    private Date servicedDate;
}
