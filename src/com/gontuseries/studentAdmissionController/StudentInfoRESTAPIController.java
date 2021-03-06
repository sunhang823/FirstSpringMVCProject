package com.gontuseries.studentAdmissionController;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class StudentInfoRESTAPIController {

	//******************Retrieving all student records***********************
	
	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Student> getStudentList() {
		Student student1 = new Student();
		student1.setStudentName("The Great Khali");
		
		Student student2 = new Student();
		student2.setStudentName("The Undertaker");
		
		Student student3 = new Student();
		student3.setStudentName("John Cena");
		
		ArrayList<Student> studentsList = new ArrayList<Student>();
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		
		return studentsList;
	}
	
	//********************Retrieving a student record***************************
	
	@RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("name") String studentName) {
		
		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentHobby("WWE");
		
		return student;
		
	}
	
	//**********************Updating a student record***************************
	
	@RequestMapping(value = "/students/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> updateStudent(@PathVariable("name") String studentName, @RequestBody Student student) {
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Name: " + student.getStudentName() + "Student Hobby: " + student.getStudentHobby());
		//find the matching student record using "studentName" from the database
		//update the matching student record with the information of student sent by the client
		//return true if update is successfully done and return false if update is not done successfully
		
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Key1", "value1");
		httpHeaders.add("Key2", "value2");
		
		
		return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.OK);
	}
	
	//**********************Posting a student record***************************
	
	@RequestMapping(value = "/students", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> postStudent(@RequestBody Student student) {
		
		System.out.println("Student Name: " + student.getStudentName() + "Student Hobby: " + student.getStudentHobby());		
		//insert the student record into the database
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Location", 
				ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{name}")
				.buildAndExpand(student.getStudentName()).toUri()
				.toString());
		
		return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.CREATED);
	}
	
	//*******************Deleting a student record***************************

	@RequestMapping(value = "/students/{name}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteStudent(@PathVariable("name") String studentName) {
		
		System.out.println("Student Name: " + studentName);		
		//delete the student record from the database
		
		
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	//*******************Deleting all student records***************************
	
	@RequestMapping(value = "/students", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteAllStudent() {
				
		//delete all student records from the database
		
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
}
