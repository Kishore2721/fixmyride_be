package com.project.fixmyride.empworksmodel;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Table(name="emp_works")
public class EmpWorksModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "appointment_id")
    private Integer appointmentId;

    @Column(name = "appointment_datetime")
    private LocalDateTime appointmentDateTime;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "customer_city")
    private String customerCity;

    @Column(name = "vehicle_model")
    private String vehicleModel;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "service_type")
    private String serviceType;

    @Column(name = "bill_amount")
    private Double billAmount;

    @Column(name = "status")
    private String status;

    @Column(name = "completion_datetime")
    private LocalDateTime completionDateTime;
}
