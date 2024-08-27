package com.nagarro.docker.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.docker.app.entity.PersonEntity;
import com.nagarro.docker.app.repo.DockerAppRepo;
import com.nagarro.docker.app.service.DockerAppService;

@Service
public class DockerAppServiceImpl implements DockerAppService {
	
	@Autowired
	DockerAppRepo repo;

	@Override
	public List<PersonEntity> getAllPerson() {
		List<PersonEntity> result = repo.findAll();
		return result;
	}

}
