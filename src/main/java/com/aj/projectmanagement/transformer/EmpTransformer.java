package com.aj.projectmanagement.transformer;

import com.aj.projectmanagement.domain.Employee;
import com.aj.projectmanagement.dto.EmployeeDTO;
import org.mapstruct.Mapper;

@Mapper
public interface EmpTransformer {
	EmployeeDTO empToEmpDTO(Employee employee);

	Employee employeeDtoToEmployee(EmployeeDTO employeeDTO);
}
