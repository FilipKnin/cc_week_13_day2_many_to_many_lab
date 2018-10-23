package com.codeclan.lab.employeeandprojects.repositories;

import com.codeclan.lab.employeeandprojects.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
