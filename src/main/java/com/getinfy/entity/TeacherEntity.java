package com.getinfy.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="teacher_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class TeacherEntity {
	
	@Id
	private Integer teacher_id;
	
	private String name;
	
	private String email;
	
	@JoinColumn(name="teacher_id_fk",referencedColumnName = "teacher_id")
	@OneToMany(cascade=CascadeType.ALL)
	private List<StudentEntity> sentity;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="school_id_fk")
	private SchoolEntity scentity;

}
