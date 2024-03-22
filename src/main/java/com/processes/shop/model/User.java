package com.processes.shop.model;

import com.processes.shop.model.enums.IdentificationType;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    private LocalDate birthday;
    @Column(name = "identification_type")
    private IdentificationType IdentificationType;
    private String Identification;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String email;
    //private List<Address> address;
}
