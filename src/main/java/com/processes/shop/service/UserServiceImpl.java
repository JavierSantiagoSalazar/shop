package com.processes.shop.service;

import com.processes.shop.model.Address;
import com.processes.shop.model.User;
import com.processes.shop.model.enums.IdentificationType;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User updatedUser, Long id) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return User.builder()
                .Identification("1054646546")
                .IdentificationType(IdentificationType.CC)
                .fullName("Javier")
                .email("elpapi@gmail.com")
                .phoneNumber("3233053264")
                .address(
                        List.of(
                                Address.builder()
                                    .avenue("6")
                                    .neighborhood("Centro")
                                    .postalCode("96544")
                                    .street("10")
                                    .build(),

                                Address.builder()
                                        .avenue("9")
                                        .neighborhood("Llano")
                                        .postalCode("96544")
                                        .street("59")
                                        .build()
                        )
                ).build();
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
