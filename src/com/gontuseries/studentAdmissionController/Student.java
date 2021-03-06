package com.gontuseries.studentAdmissionController;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"studentSkills", "studentAddress"})
@JsonPropertyOrder({"studentDOB", "student_name", "studentMobile", "studentAddress", "studentHobby", "studentSkills"})
public class Student {
	
	@JsonProperty("student_name")
	@Pattern(regexp = "[^0-9]*")
	private String studentName;
	
	@Size(min = 2, max = 30) @IsValidHobby(listOfValidHobbies = "Music|Football|Cricket|Hockey")
	private String studentHobby;
	

	private Long studentMobile;

	@Past
	private Date studentDOB;
	
	private ArrayList<String> studentSkills;
	
	private Address studentAddress;
	
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
	public String getStudentHobby() {
		return studentHobby;
	}
	
	public Long getStudentMobile() {
		return studentMobile;
	}
	
	public Date getStudentDOB() {
		return studentDOB;
	}
	
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

}