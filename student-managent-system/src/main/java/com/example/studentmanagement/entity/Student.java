package com.example.studentmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@SequenceGenerator(name = "mySequence", initialValue = 1, allocationSize = 1, sequenceName = "studentIdSequence")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mySequence")
	private Integer studentId;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String emailId;
	
	@Column(nullable = false)
	private String mobileNo;

	public Student() {
		
	}

	public Student(String firstName, String lastName, String emailId, String mobileNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
}
