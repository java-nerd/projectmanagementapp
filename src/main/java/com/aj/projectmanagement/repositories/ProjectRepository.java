package com.aj.projectmanagement.repositories;

import com.aj.projectmanagement.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
