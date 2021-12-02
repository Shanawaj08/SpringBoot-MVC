package com.example.studentmanagement.service;

import java.util.List;

import com.example.studentmanagement.entity.Student;

public interface StudentsService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);

	Student getStudentById(int id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(int id);
}
