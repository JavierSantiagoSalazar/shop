package com.processes.shop.model;

import com.processes.shop.model.enums.IdentificationType;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class User {

    private String fullName;
    private Date birthday;
    private IdentificationType IdentificationType;
    private String Identification;
    private String phoneNumber;
    private String email;
    private List<Address> address;
}
