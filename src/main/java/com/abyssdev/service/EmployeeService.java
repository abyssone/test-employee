package com.abyssdev.service;

import com.abyssdev.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findByName();
    void save(Employee employee);
    void delete(Employee employee);

}
