package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveAnEmployee() {
		Employee employee1 = new Employee("Dave", 25, "12345", "dave@mail.com");
		Employee employee2 = new Employee("Jack", 31, "56789", "jack@mail.com");
		Employee employee3 = new Employee("Julia", 28, "98765", "julia@mail.com");
		Employee employee4 = new Employee("Hannah", 26, "54321", "hannah@mail.com");
		employeeRepo.save(employee1);
		employeeRepo.save(employee2);
		employeeRepo.save(employee3);
		employeeRepo.save(employee4);
	}

	@Test
	public void canGetAllEmployees() {
		employeeRepo.findAll();
	}

}
