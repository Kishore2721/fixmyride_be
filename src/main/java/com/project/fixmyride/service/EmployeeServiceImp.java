package com.project.fixmyride.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.project.fixmyride.employeemodel.EmployeeModel;
import com.project.fixmyride.repositories.EmployeeRepository;
@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	private EmployeeRepository repository;
	@Override
	public ResponseEntity<EmployeeModel> addEmployee(EmployeeModel model) {
		// TODO Auto-generated method stub
		try {
			return new ResponseEntity<EmployeeModel>(repository.save(model),HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	// view employee
	@Override
	public ResponseEntity<List<EmployeeModel>> viewEmployee() {
		
		try { 
			return new ResponseEntity<List<EmployeeModel>>(repository.findAll(),HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}

	@Override
	public ResponseEntity<EmployeeModel> deleteEmployee(Integer empId) {
		try {
			Optional<EmployeeModel>  em = repository.findById(empId);
			if(em.isPresent()) {
				repository.deleteById(empId);
				return new ResponseEntity<EmployeeModel>(em.get(),HttpStatus.ACCEPTED);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return new ResponseEntity<EmployeeModel>(HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<EmployeeModel> viewOneEmployee(Integer empId) {
		try {
			Optional<EmployeeModel> em = repository.findById(empId);
			if(em.isPresent()) {
				return new ResponseEntity<EmployeeModel>(em.get(),HttpStatus.ACCEPTED);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return new ResponseEntity<EmployeeModel>(new EmployeeModel(),HttpStatus.NOT_FOUND);
	}

}
