package com.project.fixmyride.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fixmyride.model.UserModel;
@Repository
public interface CustomerRepository extends JpaRepository<UserModel, Integer>{

}
