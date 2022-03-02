package com.priya.jpa.hibernate.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.priya.jpa.hibernate.demo.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CourseRepository {
	@Autowired
	EntityManager entityManager;
//	@PersistenceContext
//	EntityManager entityManager;

	//public Course findById(Long id)
	
	//public void deleteById(Long id) --n> delete by using id
	
	public Course findById(Long id) {
		return entityManager.find(Course.class, id);
	}
	
	//public Course save(Course course) --> insert or update
	
	public Course save(Course course) {
		if(course.getId()==null) {
			//insert
			 entityManager.persist(course);
		}
		else {
		//update
		entityManager.merge(course);
	}
	return course;
	}

	//public void deleteById(Long id) --n> delete by using id
	public void deleteById(Long id) {
		Course course = findById(id);
		entityManager.remove(course);
	}


}
