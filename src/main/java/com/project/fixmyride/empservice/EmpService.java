package com.project.fixmyride.empservice;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.project.fixmyride.empworksmodel.EmpWorksModel;

public interface EmpService {

	public ResponseEntity<List<EmpWorksModel>>viewall();
}
