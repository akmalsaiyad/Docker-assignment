package com.nagarro.docker.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.docker.app.entity.PersonEntity;

@Repository
public interface DockerAppRepo extends JpaRepository<PersonEntity,Long> {

}
