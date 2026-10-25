package com.example.main;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private Long studentId;
	private String name;
	public Student() {
		this("sample user");
	}
	public Student(String name) {
		this.name = name;
	}
    public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
