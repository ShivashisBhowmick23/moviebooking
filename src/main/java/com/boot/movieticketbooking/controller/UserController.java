package com.boot.movieticketbooking.controller;

import com.boot.movieticketbooking.entity.User;
import com.boot.movieticketbooking.service.UserService;
import com.boot.movieticketbooking.urls.URLConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(URLConstants.USER_REST_URL)
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = URLConstants.USER_ADD_USER)
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
}
