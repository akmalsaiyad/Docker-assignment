package com.nagarro.docker.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.docker.app.entity.PersonEntity;
import com.nagarro.docker.app.service.DockerAppService;

@RestController
public class DockerAppController {

	@Autowired
	DockerAppService docService;

	@GetMapping("/person")
	public List<PersonEntity> getAllUsers() {
		return docService.getAllPerson();

	}

}
