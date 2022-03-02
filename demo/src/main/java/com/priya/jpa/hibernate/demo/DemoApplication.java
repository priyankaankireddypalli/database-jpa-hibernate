package com.priya.jpa.hibernate.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.priya.jpa.hibernate.demo.entity.Course;
import com.priya.jpa.hibernate.demo.repository.CourseRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course  = repository.findById(10001L);
		logger.info("Course details of 10001 is {} ",course);
		
		//repository.deleteById(10001L);
		repository.save(new Course("Microservices in 100 Applications"));
	}

}
