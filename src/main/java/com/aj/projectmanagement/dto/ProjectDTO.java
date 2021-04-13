package com.aj.projectmanagement.dto;

import com.aj.projectmanagement.domain.ProjectState;

public class ProjectDTO {
	private String description;
	private String name;
	private ProjectState state;

	public ProjectDTO() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProjectState getState() {
		return state;
	}

	public void setState(ProjectState state) {
		this.state = state;
	}
}
