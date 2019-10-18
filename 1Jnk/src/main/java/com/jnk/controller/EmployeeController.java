package com.jnk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jnk.model.Employee;
import com.jnk.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public void saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}

	@GetMapping("/get/{id}")
	public Employee getEmployee(@PathVariable String id) {
		Employee employee = employeeService.getEmployee(id);
		return employee;
	}

	@GetMapping("/getAll")
	public List<Employee> getEmployees() {
		List<Employee> employees = employeeService.getEmployees();
		return employees;
	}
}
