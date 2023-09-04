package com.getinfy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.getinfy.entity.TeacherEntity;
import com.getinfy.service.TaskService;

@RestController
public class TaskRestController {

	@Autowired
	private TaskService service;

	@PostMapping("/saveTeacher")
	public ResponseEntity<String> saveTeacher(@RequestBody TeacherEntity entity) {

		service.saveTeacher(entity);
       return new ResponseEntity<String>("data saved",HttpStatus.CREATED);
	}
	@DeleteMapping("/deleteTeacher/{id}")
	public ResponseEntity<String> deleteTeacher(@PathVariable Integer id) {

		service.deleteTeacher(id);
       return new ResponseEntity<String>("data deleted with the id:"+id,HttpStatus.OK);
	}
	
	@GetMapping("/getTeacher/{id}")
	public ResponseEntity<TeacherEntity> getTeacherData(@PathVariable Integer id) {

		TeacherEntity teacherdata = service.getTeacherdata(id);
       return new ResponseEntity<TeacherEntity>(teacherdata,HttpStatus.OK);
	}
	
	@GetMapping("/getTeachersData")
	public ResponseEntity<List<TeacherEntity>> getTeachersData() {
		List<TeacherEntity> allTeachersData = service.getAllTeachersData();
		
       return new ResponseEntity<List<TeacherEntity>>(allTeachersData,HttpStatus.OK);
	}
	
	
	

}
