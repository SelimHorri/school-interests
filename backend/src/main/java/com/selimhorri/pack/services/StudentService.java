package com.selimhorri.pack.services;

import java.util.List;

import com.selimhorri.pack.models.dto.StudentDto;
import com.selimhorri.pack.models.entities.Student;

public interface StudentService {
	
	List<Student> findAll();
	Student findById(final Integer studentId);
	Student save(final StudentDto studentDto);
	Student save(final Student student);
	Student update(final StudentDto studentDto);
	Student update(final Student student);
	void deleteById(final Integer studentId);
	void delete(final Student student);
	
}





