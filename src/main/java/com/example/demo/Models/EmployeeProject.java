package com.example.demo.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeProject {

    @Id
    @GeneratedValue
    private Long employeeProjectId;

    @ManyToOne(mappedBy = "project")
    private Employee employee;

    @ManyToOne
    private Project project;

    public Long getEmployeeProjectId() {
        return employeeProjectId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }
}
