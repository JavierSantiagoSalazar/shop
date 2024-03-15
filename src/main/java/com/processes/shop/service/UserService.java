package com.processes.shop.service;

import com.processes.shop.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User updateUser(User updatedUser, Long id);
    User getUserById(Long id);
    List<User> getUsers();
}
