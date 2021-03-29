package com.aj.projectmanagement.repositories;

import com.aj.projectmanagement.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
