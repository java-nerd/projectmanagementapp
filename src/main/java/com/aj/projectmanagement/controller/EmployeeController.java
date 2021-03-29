package com.aj.projectmanagement.controller;

import com.aj.projectmanagement.domain.Employee;
import com.aj.projectmanagement.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employees")
public class EmployeeController {

	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping(value = "/new")
	public String sayHello(Model model) {
		model.addAttribute("employee", new Employee());
		return "employee";
	}

	@PostMapping(value = "/create")
	public String saveProject(Employee employee) {
		final Employee employee1 = employeeService.save(employee);
		if (employee1 != null) {
			return "redirect:/employees/new";
		} else {
			return "redirect:/employees/error";
		}
	}
}
