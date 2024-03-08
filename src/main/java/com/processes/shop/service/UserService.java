package com.processes.shop.service;

import com.processes.shop.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User createUser(User user);
    User updateUser(User updatedUser, Long id);
    User getUserById(Long id);
    List<User> getUsers();
}
