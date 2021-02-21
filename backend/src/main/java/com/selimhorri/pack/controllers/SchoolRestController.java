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

import com.selimhorri.pack.models.entities.School;
import com.selimhorri.pack.services.SchoolService;

@RestController
@RequestMapping(value = {"/app/api/schools"})
public class SchoolRestController {
	
	private final SchoolService schoolService;
	
	@Autowired
	public SchoolRestController(final SchoolService schoolService) {
		this.schoolService = schoolService;
	}
	
	@GetMapping(value = {"", "/", "/*", "/all"})
	public ResponseEntity<List<School>> findAll() {
		return new ResponseEntity<>(this.schoolService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = {"/{schoolId}"})
	public ResponseEntity<School> findById(@PathVariable("schoolId") final String schoolId) {
		return new ResponseEntity<>(this.schoolService.findById(Integer.parseInt(schoolId)), HttpStatus.OK);
	}
	
	@PostMapping(value = {"", "/", "/save", "/add"})
	public ResponseEntity<School> save(@RequestBody final School school) {
		return new ResponseEntity<>(this.schoolService.save(school), HttpStatus.OK);
	}
	
	@PutMapping(value = {"", "/", "/update", "/edit"})
	public ResponseEntity<School> update(@RequestBody final School school) {
		return new ResponseEntity<>(this.schoolService.update(school), HttpStatus.OK);
	}
	
	@DeleteMapping(value = {"/{schoolId}", "/deleteById/{schoolId}"})
	public ResponseEntity<?> deleteById(@PathVariable("schoolId") final String schoolId) {
		this.schoolService.deleteById(Integer.parseInt(schoolId));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = {"", "/", "/delete"})
	public ResponseEntity<?> delete(@RequestBody final School school) {
		this.schoolService.delete(school);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
}







