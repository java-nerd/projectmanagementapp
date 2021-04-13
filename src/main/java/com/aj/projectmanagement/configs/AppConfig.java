package com.aj.projectmanagement.configs;

import com.aj.projectmanagement.transformer.EmpTransformer;
import com.aj.projectmanagement.transformer.ProjectTransformer;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "empMapper")
	public EmpTransformer getEmpMapper() {
		return Mappers.getMapper(EmpTransformer.class);
	}

	@Bean(name = "projectMapper")
	public ProjectTransformer getProjectMapper() {
		return Mappers.getMapper(ProjectTransformer.class);
	}

}
