package com.example.demo.Controllers;
import com.example.demo.Models.Project;
import com.example.demo.Repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepo;

    public ProjectController(ProjectRepository projectRepo) {
        this.projectRepo = projectRepo;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
        Optional<Project> project = projectRepo.findById(id);
        if (project.isPresent()) {
            return ResponseEntity.ok(project.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        Project savedProject = projectRepo.save(project);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProject);
    }
}
