package com.aj.projectmanagement.controller;

import com.aj.projectmanagement.domain.Employee;
import com.aj.projectmanagement.domain.Project;
import com.aj.projectmanagement.services.EmployeeService;
import com.aj.projectmanagement.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

	private final EmployeeService employeeService;
	private final ProjectService projectService;

	@Autowired
	public HomeController(EmployeeService employeeService, ProjectService projectService) {
		this.employeeService = employeeService;
		this.projectService = projectService;
	}

	@GetMapping(value = "/")
	public String sayHello(Model model) {
		final List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		final List<Project> projects = projectService.findAll();
		model.addAttribute("projects", projects);
		return "home/homepage";
	}
}
