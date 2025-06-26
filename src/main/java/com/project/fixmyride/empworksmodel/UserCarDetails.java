package com.project.fixmyride.empworksmodel;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_car_details")
public class UserCarDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entry_id")
    private Integer entryId;

    @Column(name = "userEmail", nullable = false) // changed
    private String userEmail;

    @Column(name = "userName", nullable = false) // changed
    private String userName;

    @Column(name = "userPhone", nullable = false) // changed
    private Long userPhone;

    @Column(name = "vehicleModel", nullable = false) // changed
    private String vehicleModel;

    @Column(name = "vehicleNumber", nullable = false) // changed
    private String vehicleNumber;

    @Column(name = "serviceType", nullable = false) // changed
    private String serviceType;

    @Column(name = "place", nullable = false)
    private String place;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm")
    @Column(name = "appointmentDateTime", nullable = false) // changed
    private LocalDateTime appointmentDateTime;
}
