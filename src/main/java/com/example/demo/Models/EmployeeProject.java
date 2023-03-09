package com.example.demo.Models;
import javax.persistence.Entity;

@Entity
public class EmployeeProject {
    private Long employeeProjectId;
    private String employeeName;
    private String projectName;

    public EmployeeProject(Long employeeProjectId, String employeeName, String projectName) {
        this.employeeProjectId = employeeProjectId;
        this.employeeName = employeeName;
        this.projectName = projectName;
    }

    public EmployeeProject(Employee employee2, Project project2) {
    }

    public EmployeeProject(long employeeProjectId, Employee employee1, Project project1) {
    }

    public Long getEmployeeProjectId() {
        return employeeProjectId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getProjectName() {
        return projectName;
    }
}


