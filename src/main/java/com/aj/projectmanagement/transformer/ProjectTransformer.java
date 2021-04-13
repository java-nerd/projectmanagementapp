package com.aj.projectmanagement.transformer;

import com.aj.projectmanagement.domain.Project;
import com.aj.projectmanagement.dto.ProjectDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ProjectTransformer {
	ProjectDTO projectToProjectDTO(Project project);

	Project projectDtoToProject(ProjectDTO projectDTO);
}
