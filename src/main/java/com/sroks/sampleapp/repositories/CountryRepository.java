package com.sroks.sampleapp.repositories;

import com.sroks.sampleapp.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
