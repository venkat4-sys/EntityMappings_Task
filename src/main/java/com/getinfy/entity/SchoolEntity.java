package com.getinfy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="school_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class SchoolEntity {
	
	@Id
	private Integer school_id;
	
	private String name;
	
	private String location;

}
