package com.abyssdev.controller;

import com.abyssdev.model.Employee;
import com.abyssdev.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/")
    public String getEmployee() {
        String resp = "";
        List<Employee> employees = employeeService.findAll();

        try{
            resp = objectMapper.writeValueAsString(employees);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resp;
    }

    @PostMapping("/")
    public List<Employee> addEmployee(@RequestParam(name = "name") String name,
                            @RequestParam(name = "email") String email,
                            @RequestParam(name = "password") String password) {
        System.out.println("Новый сотрудник:" + name + " " + email + " " + password);
        employeeService.save(name, email, password);
        return employeeService.findAll();
    }
}
