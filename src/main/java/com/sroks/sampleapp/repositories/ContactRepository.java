package com.sroks.sampleapp.repositories;


import com.sroks.sampleapp.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
