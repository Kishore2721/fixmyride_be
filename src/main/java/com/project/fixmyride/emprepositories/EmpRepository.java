package com.project.fixmyride.emprepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fixmyride.empworksmodel.EmpWorksModel;

@Repository
public interface EmpRepository extends JpaRepository<EmpWorksModel, Integer> {

}
