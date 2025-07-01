package com.project.fixmyride.emprepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fixmyride.empworksmodel.UserCarDetails;

@Repository
public interface UserCarDetailsRepository extends JpaRepository<UserCarDetails, Integer> {
    // add custom queries if needed
}
