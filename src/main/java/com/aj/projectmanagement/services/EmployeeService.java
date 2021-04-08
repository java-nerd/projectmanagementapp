package com.aj.projectmanagement.services;

import com.aj.projectmanagement.domain.Employee;
import com.aj.projectmanagement.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}

	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
}
