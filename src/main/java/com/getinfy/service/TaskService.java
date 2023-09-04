package com.getinfy.service;

import java.util.List;

import com.getinfy.entity.TeacherEntity;

public interface TaskService {
	
	public boolean saveTeacher(TeacherEntity entity);
	
	public boolean deleteTeacher(Integer id);
	
	public TeacherEntity getTeacherdata(Integer id); 
	
	public List<TeacherEntity> getAllTeachersData();

}
