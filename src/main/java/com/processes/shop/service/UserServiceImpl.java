package com.processes.shop.service;

import com.processes.shop.model.User;
import com.processes.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User updatedUser, Long id) {
        Optional<User> userDb = userRepository.findById(id);
        if (userDb.isEmpty()){
            return null;
        }
        userDb.get().setFullName(updatedUser.getFullName());
        userDb.get().setPhoneNumber(updatedUser.getPhoneNumber());
        return userRepository.save(userDb.get());
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
}
