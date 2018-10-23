package com.codeclan.lab.employeeandprojects.repositories;

import com.codeclan.lab.employeeandprojects.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
