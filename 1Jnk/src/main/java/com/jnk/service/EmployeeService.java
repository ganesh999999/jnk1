package com.jnk.service;

import java.util.List;

import com.jnk.model.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee employee);
	public Employee getEmployee(String id);
	public List<Employee> getEmployees();
}
