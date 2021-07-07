package com.te.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.studentmanagement.entity.StudentData;
import com.te.studentmanagement.service.StudentService;

@RestController

public class StudentController {
	
	@Autowired
	private StudentService service;
	

    @PostMapping("/addStudent")
    public StudentData addStudent(@RequestBody StudentData student) {
        return service.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<StudentData> addStudents(@RequestBody List<StudentData> students) {
        return service.saveStudents(students);
    }

    @GetMapping("/students")
    public List<StudentData> findAllStudents() {
        return service.getStudents();
    }

    @GetMapping("/studentById/{userID}")
    public StudentData findStudentById(@PathVariable int id) {
 
        return service.getStudentsById(id);
    }


    @PutMapping("/update")
    public StudentData updateStudent(@RequestBody StudentData student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }

}
