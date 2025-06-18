package com.project.fixmyride.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fixmyride.employeemodel.EmployeeModel;
import com.project.fixmyride.service.EmployeeService;

@RestController
@RequestMapping("employee")
@CrossOrigin(origins = "http://localhost:3000/")
public class EmployeeController {
		@Autowired
		private EmployeeService service;
//		http://localhost:9090/employee/addemp
		@PostMapping("addemp")
		public ResponseEntity<EmployeeModel> addEmployee(@RequestBody EmployeeModel model){
			return service.addEmployee(model);
			
		}
		
		//to view all emolpyee
		
		@GetMapping("viewemp")
		//http://localhost:9090/employee/viewemp
		public ResponseEntity<List<EmployeeModel>> viewEmployee(){
			return service.viewEmployee();
		}
		
		//https://localhost:9090/employee/deleteemp/201
		
		@DeleteMapping("deleteemp/{empId}")
		public ResponseEntity<EmployeeModel> deleteEmployee(@PathVariable Integer empId){
			return service.deleteEmployee(empId);
		}
		// http://localhost:9090/employee/oneemp/20144
		@GetMapping("oneemp/{empId}")
		public ResponseEntity<EmployeeModel> viewOneEmployee(@PathVariable Integer empId){
			return service.viewOneEmployee(empId);
		}
		
		
}
