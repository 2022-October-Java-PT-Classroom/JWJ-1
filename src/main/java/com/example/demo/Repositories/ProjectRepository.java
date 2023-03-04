package com.example.demo.Repositories;

import com.example.demo.Models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
