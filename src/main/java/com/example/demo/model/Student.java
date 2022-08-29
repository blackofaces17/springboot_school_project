package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "className")
	private String className;
	
	@Column(name = "rollNo")
	private String rollNo;
	
	@Column(name = "attendance")
	private String attendance;
	
	public Student() {
		
	}
	
	public Student(String name, String classname, String rollno, String attendance) {
		super();
		this.name = name;
		this.className = classname;
		this.rollNo = rollno;
		this.attendance = attendance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return className;
	}
	public void setClassname(String classname) {
		this.className = classname;
	}
	public String getRollno() {
		return rollNo;
	}
	public void setRollno(String rollno) {
		this.rollNo = rollno;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

}
