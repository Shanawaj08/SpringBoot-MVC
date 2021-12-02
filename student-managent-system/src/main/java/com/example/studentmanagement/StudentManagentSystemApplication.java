package com.example.studentmanagement;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;

@SpringBootApplication
public class StudentManagentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagentSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("Shanawaj", "Mansuri", "shanawaj@gmail.com", "8857909720");
		studentRepo.save(student1);
		Student student2 = new Student("Suraj", "Kakade", "suraj@gmail.com", "9876543210");
		studentRepo.save(student2);
		Student student3 = new Student("Sanjay", "Chauhan", "sanjay@gmail.com", "8877665544");
		studentRepo.save(student3);
		
		
	}

}
