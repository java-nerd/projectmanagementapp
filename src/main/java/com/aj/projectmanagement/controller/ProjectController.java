package com.aj.projectmanagement.controller;

import com.aj.projectmanagement.domain.Project;
import com.aj.projectmanagement.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("projects")
public class ProjectController {

	private final ProjectService projectService;

	@Autowired
	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}

	@GetMapping(value = "/new")
	public String sayHello(Model model) {
		model.addAttribute("project", new Project());
		return "project";
	}

	@PostMapping(value = "/create")
	public String saveProject(Project project) {
		final Project savedProject = projectService.save(project);
		if (savedProject != null) {
			return "redirect:/projects/new";
		} else {
			return "redirect:/projects/error";
		}
	}
}
