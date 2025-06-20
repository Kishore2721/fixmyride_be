package com.project.fixmyride.empservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.fixmyride.emprepositories.EmpRepository;
import com.project.fixmyride.empworksmodel.EmpWorksModel;



@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepository empRepository;
	
	@Override
	public ResponseEntity<List<EmpWorksModel>> viewall() {
		try {
			return new ResponseEntity<List<EmpWorksModel>>(empRepository.findAll(),HttpStatus.OK);
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return new ResponseEntity<List<EmpWorksModel>>(new ArrayList<EmpWorksModel>(),HttpStatus.NOT_FOUND);
	}

	
}
