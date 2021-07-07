package com.te.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import com.te.studentmanagement.entity.StudentData;

@EnableJpaRepositories
public interface StudentRepo extends JpaRepository<StudentData,Integer>{
	
	
	    StudentData findByName(String name);
	}


