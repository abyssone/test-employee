package com.abyssdev.service;

import com.abyssdev.model.Employee;
import com.abyssdev.storage.InMemoryStorage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final InMemoryStorage inMemoryStorage = new InMemoryStorage();

    @Override
    public List<Employee> findAll() {
        return inMemoryStorage.getAll();
    }

    @Override
    public Employee findByName() {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }
}
