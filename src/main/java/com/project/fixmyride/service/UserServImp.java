package com.project.fixmyride.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.project.fixmyride.FixmyrideBeApplication;
import com.project.fixmyride.model.UserModel;
import com.project.fixmyride.repositories.CustomerRepository;

@Service
public class UserServImp implements UserService {

    private final FixmyrideBeApplication fixmyrideBeApplication;
@Autowired
private CustomerRepository repository;

    UserServImp(FixmyrideBeApplication fixmyrideBeApplication) {
        this.fixmyrideBeApplication = fixmyrideBeApplication;
    }

@Override
public ResponseEntity<UserModel> addUser(UserModel model) {
	// TODO Auto-generated method stub
	try {
		return new ResponseEntity<UserModel>(repository.save(model),HttpStatus.CREATED);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return null;
}




}

