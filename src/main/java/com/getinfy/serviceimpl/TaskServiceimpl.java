package com.getinfy.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getinfy.entity.TeacherEntity;
import com.getinfy.repo.TeacherRepo;
import com.getinfy.service.TaskService;

@Service
public class TaskServiceimpl implements TaskService {

	@Autowired
	private TeacherRepo teachrepo;

	@Override
	public boolean saveTeacher(TeacherEntity entity) {

		teachrepo.save(entity);

		return true;
	}
	
	@Override
	public boolean deleteTeacher(Integer id) {
		teachrepo.deleteById(id);
		return true;
	}
	
	public TeacherEntity getTeacherdata(Integer id) {
		Optional<TeacherEntity> findById = teachrepo.findById(id);
		
		if(findById.isPresent()) {
			
			TeacherEntity teacherEntity = findById.get();
			
			return teacherEntity;
		}
		return null;
	}
	
	@Override
	public List<TeacherEntity> getAllTeachersData() {
		
		List<TeacherEntity> findAll = teachrepo.findAll();
		return findAll;
	}

}
