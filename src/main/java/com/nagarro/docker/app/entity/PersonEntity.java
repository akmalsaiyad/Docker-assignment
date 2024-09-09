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
	public long getPersonID() {
		return personID;
	}
	public void setPersonID(long personID) {
		this.personID = personID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String address;
	public int age;
	public String message = "HELLO WORLD";

}
