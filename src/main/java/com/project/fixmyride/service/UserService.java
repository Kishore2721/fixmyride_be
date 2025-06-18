package com.project.fixmyride.service;

import org.springframework.http.ResponseEntity;

import com.project.fixmyride.model.UserModel;

public interface UserService {

	public ResponseEntity<UserModel> addUser(UserModel model);

}
