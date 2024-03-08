package com.processes.shop.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private String fullName;
    private Date birthday;
    private String IdentificationType;
    private String Identification;
    private String phoneNumber;
    private String email;
    private String address;
}
