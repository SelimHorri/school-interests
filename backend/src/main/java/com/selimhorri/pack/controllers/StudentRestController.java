package com.selimhorri.pack.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.pack.models.entities.Student;
import com.selimhorri.pack.services.StudentService;

@RestController
@RequestMapping(value = {"/app/api/students"})
public class StudentRestController {
	
	private final StudentService studentService;
	
	@Autowired
	public StudentRestController(final StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping(value = {"", "/", "/*", "/all"})
	public ResponseEntity<List<Student>> findAll() {
		return new ResponseEntity<>(this.studentService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = {"/{studentId}"})
	public ResponseEntity<Student> findById(@PathVariable("studentId") final String studentId) {
		return new ResponseEntity<>(this.studentService.findById(Integer.parseInt(studentId)), HttpStatus.OK);
	}
	
	@PostMapping(value = {"", "/", "/save", "/add"})
	public ResponseEntity<Student> save(@RequestBody final Student student) {
		return new ResponseEntity<>(this.studentService.save(student), HttpStatus.OK);
	}
	
	@PutMapping(value = {"", "/", "/update", "/edit"})
	public ResponseEntity<Student> update(@RequestBody final Student student) {
		return new ResponseEntity<>(this.studentService.update(student), HttpStatus.OK);
	}
	
	@DeleteMapping(value = {"/{studentId}", "/deleteById/{studentId}"})
	public ResponseEntity<?> deleteById(@PathVariable("studentId") final String studentId) {
		this.studentService.deleteById(Integer.parseInt(studentId));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = {"", "/", "/delete"})
	public ResponseEntity<?> delete(@RequestBody final Student student) {
		this.studentService.delete(student);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
}







