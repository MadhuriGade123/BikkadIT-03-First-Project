package com.example.demo.model;
@Entity
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private String studentEmail;
	private int StudentAge;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public int getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}

}
