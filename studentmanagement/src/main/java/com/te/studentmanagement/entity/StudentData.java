package com.te.studentmanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_db")
public class StudentData implements Serializable{

	@Id
	@GeneratedValue
	private int userID;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column
	private String email;
	@Column
	private double marks;
	@Column
	private char grade;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentData [userID=" + userID + ", email=" + email + ", marks=" + marks + ", grade=" + grade + "]";
	}
	public StudentData() {
		
	}
	public StudentData(int userID, String email, double marks, char grade) {
		super();
		this.userID = userID;
		this.email = email;
		this.marks = marks;
		this.grade = grade;
	}
	
}
