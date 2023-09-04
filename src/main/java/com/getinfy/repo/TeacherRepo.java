package com.getinfy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinfy.entity.TeacherEntity;

public interface TeacherRepo extends JpaRepository<TeacherEntity, Integer> {
	
	

}
