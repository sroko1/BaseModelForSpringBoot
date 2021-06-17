package com.sroks.sampleapp.repositories;

import com.sroks.sampleapp.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
