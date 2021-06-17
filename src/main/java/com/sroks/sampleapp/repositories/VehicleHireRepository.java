package com.sroks.sampleapp.repositories;

import com.sroks.sampleapp.models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
