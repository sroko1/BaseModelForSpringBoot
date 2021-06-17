package com.sroks.sampleapp.repositories;

import com.sroks.sampleapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
