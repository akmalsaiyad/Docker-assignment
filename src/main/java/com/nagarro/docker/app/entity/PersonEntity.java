package com.nagarro.docker.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long personID;
	public String name;
	public String address;
	public int age;

}
