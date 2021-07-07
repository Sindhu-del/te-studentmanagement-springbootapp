package com.te.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.studentmanagement.entity.StudentData;
import com.te.studentmanagement.repository.StudentRepo;
@Service
public class StudentService {

	
		@Autowired
		private StudentRepo repository;

		public StudentData saveStudent(StudentData student) {
			return repository.save(student);
		}

		public List<StudentData> saveStudents(List<StudentData> students) {
			return repository.saveAll(students);
		}

		public List<StudentData> getStudents() {
			return repository.findAll();
		}

		public StudentData getStudentsById(int userID) {
			return repository.findById(userID).orElse(null);
		}
		
		public String deleteStudent(int userID) {
			repository.deleteById(userID);
			return "Student removed !! " + userID;
		}

		public StudentData updateStudent(StudentData student) {
			StudentData existingStudent = repository.findById(student.getUserID()).orElse(null);
			existingStudent.setEmail(student.getEmail());
			existingStudent.setMarks(student.getMarks());
			return repository.save(existingStudent);
		}

	}

