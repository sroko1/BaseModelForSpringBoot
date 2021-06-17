package com.sroks.sampleapp.repositories;

import com.sroks.sampleapp.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
