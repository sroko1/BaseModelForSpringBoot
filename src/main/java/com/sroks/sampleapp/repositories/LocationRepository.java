package com.sroks.sampleapp.repositories;

import com.sroks.sampleapp.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
