package com.abyssdev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
    @GetMapping("/")
    public String getEmployee() {
        return "name: dmitry";
    }
}
