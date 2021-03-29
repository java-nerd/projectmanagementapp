package com.aj.projectmanagement.controller;

import com.aj.projectmanagement.domain.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("projects")
public class ProjectController {
	@GetMapping(value = "/new")
	public String sayHello(Model model) {
		model.addAttribute("project", new Project());
		return "index";
	}
}
