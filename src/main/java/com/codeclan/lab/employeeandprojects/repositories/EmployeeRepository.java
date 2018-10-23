package com.codeclan.lab.employeeandprojects.repositories;

import com.codeclan.lab.employeeandprojects.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
