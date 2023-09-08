package com.bikash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bikash.entities.Employee;
import com.bikash.exception.ResourceNotFoundException;
import com.bikash.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {

        Optional<Employee> savedEmployee = employeeRepository.findById(employee.getId());
        if(savedEmployee.isPresent()){
        	try {
        		 throw new ResourceNotFoundException("Employee already exist with given id:" + employee.getId());
        	}catch (Exception e) {
        			
        	}
           
        }
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee updatedEmployee) {
        return employeeRepository.save(updatedEmployee);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}