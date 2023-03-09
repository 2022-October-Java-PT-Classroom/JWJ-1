package com.example.demo;

import com.example.demo.Models.Address;
import com.example.demo.Models.Employee;
import com.example.demo.Models.EmployeeProject;
import com.example.demo.Models.Project;
import com.example.demo.Repositories.AddressRepository;
import com.example.demo.Repositories.EmployeeProjectRepository;
import com.example.demo.Repositories.EmployeeRepository;
import com.example.demo.Repositories.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Populator implements CommandLineRunner {

    private EmployeeRepository employeeRepository;
    private AddressRepository addressRepository;
    private ProjectRepository projectRepository;
    private EmployeeProjectRepository employeeProjectRepository;

    public Populator(EmployeeRepository employeeRepository,
                             AddressRepository addressRepository,
                             ProjectRepository projectRepository,
                             EmployeeProjectRepository employeeProjectRepository) {
        this.employeeRepository = employeeRepository;
        this.addressRepository = addressRepository;
        this.projectRepository = projectRepository;
        this.employeeProjectRepository = employeeProjectRepository;

        Employee employee1 = new Employee("Khalid", "Moe", "123 Main St", "Chicago", "IL", "60601");
        Employee employee2 = new Employee("Henry", "Holland", "789 Maple St", "Chattanooga", "TN", "37402");

        Address address1 = new Address(1L, employee1, "223 North High St", "N High", "COL", "43219", "USA");
        addressRepository.save(address1);

        Address address2 = new Address(2L, employee2, "221 Lame St", "Franklin", "COL", "43220", "USA");
        addressRepository.save(address2);

        Project project1 = new Project(1L, "Project A");
        projectRepository.save(project1);

        Project project2 = new Project(2L, "Project B");
        projectRepository.save(project2);

        EmployeeProject employeeProject1 = new EmployeeProject(1L, employee1, project1);
        employeeProjectRepository.save(employeeProject1);

        EmployeeProject employeeProject2 = new EmployeeProject(2L, employee2, project1);
        employeeProjectRepository.save(employeeProject2);

        EmployeeProject employeeProject3 = new EmployeeProject(3L, employee2, project2);
        employeeProjectRepository.save(employeeProject3);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
