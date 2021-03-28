package com.aj.projectmanagement.projectmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@GetMapping(value = "/")
	public String sayHello(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("create")
	public String result(User user, RedirectAttributes attributes) {
		attributes.addAttribute("user", user);
		return "redirect:/display";
	}

	@GetMapping("display")
	public String display(User user, Model model) {
		model.addAttribute("user", user);
		return "result";
	}
}
