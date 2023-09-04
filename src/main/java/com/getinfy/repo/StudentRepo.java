package com.getinfy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinfy.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
