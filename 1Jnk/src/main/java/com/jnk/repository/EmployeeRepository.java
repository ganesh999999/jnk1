package com.jnk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnk.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{

}
