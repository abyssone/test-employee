package com.abyssdev.service;

import com.abyssdev.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findByName();
    void save(String name, String email, String password);
    void delete(Employee employee);

}
