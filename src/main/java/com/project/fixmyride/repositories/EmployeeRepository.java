package com.project.fixmyride.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fixmyride.employeemodel.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel,Integer> {

}
