package com.aj.projectmanagement.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "project", schema = "demo")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	private String description;
	private String name;
	private ProjectState state;

	public Project(String description, String name, ProjectState state) {
		this.description = description;
		this.name = name;
		this.state = state;
	}

	public Project() {
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Project project = (Project) o;
		return projectId == project.projectId && Objects.equals(description, project.description) && Objects.equals(name, project.name) && state == project.state;
	}

	@Override
	public int hashCode() {
		return Objects.hash(projectId, description, name, state);
	}
}
