package com.jnk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnk.model.Employee;
import com.jnk.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployee(String id) {
		Employee employee = employeeRepository.getOne(id);
		return employee;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}
	
	

}
