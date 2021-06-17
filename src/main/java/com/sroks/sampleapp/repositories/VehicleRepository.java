package com.sroks.sampleapp.repositories;

import com.sroks.sampleapp.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
