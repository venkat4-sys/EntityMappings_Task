package com.getinfy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinfy.entity.SchoolEntity;

public interface SchoolRepo extends JpaRepository<SchoolEntity, Integer>{

}
