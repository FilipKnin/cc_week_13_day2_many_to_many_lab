package com.codeclan.lab.employeeandprojects;

import com.codeclan.lab.employeeandprojects.models.Department;
import com.codeclan.lab.employeeandprojects.models.Employee;
import com.codeclan.lab.employeeandprojects.models.Project;
import com.codeclan.lab.employeeandprojects.repositories.DepartmentRepository;
import com.codeclan.lab.employeeandprojects.repositories.EmployeeRepository;
import com.codeclan.lab.employeeandprojects.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeandprojectsApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

    @Autowired
    ProjectRepository projectRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void createAndSaveDepartmentAndEmployee() {
		Department department1 = new Department("name1");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Bob", "xyz", 12345, department1 );
		employeeRepository.save(employee1);
	}

	@Test
    public void addEmployeesAndProjects() {

        Department department1 = new Department("name1");
        departmentRepository.save(department1);

        Employee employee1 = new Employee("Bob", "xyz", 12345, department1 );
        employeeRepository.save(employee1);

        Project project1 = new Project("projectname1", 12);
        projectRepository.save(project1);
        project1.addEmployee(employee1);
        projectRepository.save(project1);


    }

}
