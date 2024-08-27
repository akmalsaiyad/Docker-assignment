package com.nagarro.docker.app.service;

import java.util.List;

import com.nagarro.docker.app.entity.PersonEntity;

public interface DockerAppService {

	List<PersonEntity> getAllPerson();

}
