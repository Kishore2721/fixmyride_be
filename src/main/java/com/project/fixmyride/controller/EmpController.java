package com.project.fixmyride.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.fixmyride.empservice.EmpService;
import com.project.fixmyride.empworksmodel.EmpWorksModel;
import com.project.fixmyride.empworksmodel.UserCarDetails;



@RequestMapping("emp")
@RestController
@CrossOrigin(origins="http://localhost:3000/")
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@GetMapping("viewall")
	//http://localhost:9090/emp/viewall
	public ResponseEntity<List<EmpWorksModel>> viewall(){
		return empService.viewall();
	}
	@PostMapping("addCar")
	//http://localhost:9090/emp/addCar
	public ResponseEntity<UserCarDetails>addCar(@RequestBody UserCarDetails model){
		return empService.addCar(model);
	}
}
