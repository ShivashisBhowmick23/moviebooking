package com.boot.movieticketbooking.service;

import com.boot.movieticketbooking.entity.User;
import com.boot.movieticketbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository  userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByUsername(String user_name) {
        return userRepository.findByUsername(user_name).orElse(null);
    }

}
