package com.project.fixmyride.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.project.fixmyride.employeemodel.EmployeeModel;

public interface EmployeeService {

	public ResponseEntity<EmployeeModel> addEmployee(EmployeeModel model);

	public ResponseEntity<List<EmployeeModel>> viewEmployee();

	public ResponseEntity<EmployeeModel> deleteEmployee(Integer empId);

	public ResponseEntity<EmployeeModel> viewOneEmployee(Integer empId);

}
