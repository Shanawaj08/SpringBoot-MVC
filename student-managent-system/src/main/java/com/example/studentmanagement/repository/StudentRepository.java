package com.example.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
