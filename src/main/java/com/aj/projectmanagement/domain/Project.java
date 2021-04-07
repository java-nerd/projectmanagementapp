package com.aj.projectmanagement.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Table(name = "project", schema = "demo")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	private String description;
	private String name;
	private ProjectState state;

	public Project() {
	}

	public Project(String description, String name, ProjectState state) {
		this.description = description;
		this.name = name;
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
