package com.example.demo.Controllers;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepo;

    @GetMapping("/allEmployees")
    public Iterable<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }


    @PostMapping("/")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeRepo.findById(id).orElse(null);
        if (existingEmployee == null) {
            return null;
        }
        return existingEmployee;
    }
}
