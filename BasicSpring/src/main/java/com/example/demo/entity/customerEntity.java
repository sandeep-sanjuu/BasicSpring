package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class customerEntity {
	@javax.persistence.Id
	private int Id;
	private String name;
	private String location;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "customerEntity [Id=" + Id + ", name=" + name + ", location=" + location + "]";
	}

	public customerEntity() {
		super();
	}

	public customerEntity(int id, String name, String location) {
		super();
		Id = id;
		this.name = name;
		this.location = location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
