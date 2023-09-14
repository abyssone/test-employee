package com.abyssdev.storage;

import com.abyssdev.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStorage {
    private List<Employee> employeeStorage;

    public InMemoryStorage() {
        employeeStorage = new ArrayList<>();
        Employee emp1 = new Employee("Dmitry", "abyssone@gmail.com", "111");
        Employee emp2 = new Employee("Olga", "user@mail.ru", "123");
        Employee emp3 = new Employee("Igor", "example@mail.ru", "qwerty");

        employeeStorage.add(emp1);
        employeeStorage.add(emp2);
        employeeStorage.add(emp3);
    }

    public List<Employee> getAll() {
        return employeeStorage;
    }

    public void save(Employee employee) {
        employeeStorage.add(employee);
    }
}
