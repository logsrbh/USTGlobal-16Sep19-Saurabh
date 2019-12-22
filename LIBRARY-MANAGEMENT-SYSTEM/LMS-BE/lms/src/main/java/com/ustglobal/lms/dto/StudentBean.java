package com.ustglobal.lms.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table
public class StudentBean {
	
	@Id
	@Column
	private String rollno;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String department;
	@Column
	private String gender;
	@Exclude
	@OneToMany(mappedBy = "student")
	private List<BookIssue> bookIssue;
}
