package com.aj.projectmanagement.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
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
}
