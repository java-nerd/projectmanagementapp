package com.aj.projectmanagement.controller;

import com.aj.projectmanagement.domain.Employee;
import com.aj.projectmanagement.dto.EmployeeDTO;
import com.aj.projectmanagement.services.EmployeeService;
import com.aj.projectmanagement.transformer.EmpTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("employees")
public class EmployeeController {

	private final EmployeeService employeeService;
	private final EmpTransformer empMapper;

	@Autowired
	public EmployeeController(EmployeeService employeeService, EmpTransformer empMapper) {
		this.employeeService = employeeService;
		this.empMapper = empMapper;
	}

	@GetMapping
	public String allProjects(Model model) {
		final List<Employee> all = employeeService.findAll();
		model.addAttribute("employees", all);
		return "employees/allemployees";
	}

	@GetMapping(value = "/new")
	public String sayHello(Model model) {
		model.addAttribute("employee", new EmployeeDTO());
		return "employees/employee";
	}

	@PostMapping(value = "/create")
	public String saveProject(EmployeeDTO employeeDTO) {
		final Employee employee = empMapper.employeeDtoToEmployee(employeeDTO);
		final Employee employee1 = employeeService.save(employee);
		if (employee1 != null) {
			return "redirect:/employees/new";
		} else {
			return "redirect:/employees/error";
		}
	}
}
