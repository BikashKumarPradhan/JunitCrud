package com.bikash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikash.entities.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
