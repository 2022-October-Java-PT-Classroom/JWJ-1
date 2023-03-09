package com.example.demo.Controllers;


import com.example.demo.Models.EmployeeProject;
import com.example.demo.Repositories.EmployeeProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeProjectController {
        @Autowired
        private EmployeeProjectRepository employeeProjectRepository;

        @GetMapping("/{id}")
        public ResponseEntity<EmployeeProject> getEmployeeProjectById(@PathVariable Long id) {
            Optional<EmployeeProject> employeeProject = employeeProjectRepository.findById(id);
            if (employeeProject.isPresent()) {
                return ResponseEntity.ok(employeeProject.get());
            } else {
                return ResponseEntity.notFound().build();
            }
        }
    @PostMapping("")
    public ResponseEntity<EmployeeProject> createEmployeeProject(@RequestBody EmployeeProject employeeProject) {
        EmployeeProject savedEmployeeProject = employeeProjectRepository.save(employeeProject);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployeeProject);
    }
}
