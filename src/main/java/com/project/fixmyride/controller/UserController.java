package com.project.fixmyride.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fixmyride.model.UserModel;
import com.project.fixmyride.service.UserService;



@RestController
@RequestMapping("user")
@CrossOrigin(origins ="http://localhost:3000")
public class UserController {
@Autowired
private UserService service;
@PostMapping("add")
public ResponseEntity<UserModel> addUser(@RequestBody UserModel model) {
    return service.addUser(model);
}
}
