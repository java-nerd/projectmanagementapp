package com.aj.projectmanagement.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project", schema = "demo")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long projectId;
	private String description;
	private String name;
	private ProjectState state;
}
