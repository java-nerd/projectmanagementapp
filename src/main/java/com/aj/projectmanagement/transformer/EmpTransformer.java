package com.aj.projectmanagement.transformer;

import com.aj.projectmanagement.domain.Employee;
import com.aj.projectmanagement.dto.EmployeeDTO;
import org.mapstruct.Mapper;

@Mapper
public interface EmpTransformer {
	EmployeeDTO toDto(Employee employee);

	Employee toEmp(EmployeeDTO employeeDTO);
}
