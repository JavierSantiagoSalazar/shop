package com.processes.shop.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String avenue;
    private String postalCode;
    private String neighborhood;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private User user;
}
