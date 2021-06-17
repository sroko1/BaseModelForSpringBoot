package com.sroks.sampleapp.repositories;


import com.sroks.sampleapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
