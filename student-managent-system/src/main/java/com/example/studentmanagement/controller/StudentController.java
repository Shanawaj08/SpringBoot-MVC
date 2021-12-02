package com.example.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.service.StudentsService;

@Controller
public class StudentController {

	private StudentsService studentService;

	public StudentController(StudentsService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping
	public String printMsg() {
		return "Welcome";
	}
	
	@GetMapping("students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student); //value is student object here
		return "create_student";
	}
	
	@PostMapping("students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable("id") int id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student_form";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable("id") int id, @ModelAttribute("student") Student student, Model model) {
		Student existing = studentService.getStudentById(id);
		existing.setFirstName(student.getFirstName());
		existing.setLastName(student.getLastName());
		existing.setEmailId(student.getEmailId());
		existing.setMobileNo(student.getMobileNo());
		
		studentService.updateStudent(existing);
		return "redirect:/students";
	}
	
	@GetMapping("students/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
