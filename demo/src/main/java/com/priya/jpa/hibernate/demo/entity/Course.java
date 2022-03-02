package com.priya.jpa.hibernate.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	protected Course() {}
	//Constructor
	public Course(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
	
	
}
