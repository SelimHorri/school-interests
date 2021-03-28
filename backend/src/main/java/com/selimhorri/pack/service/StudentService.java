package com.selimhorri.pack.service;

import java.util.List;

import com.selimhorri.pack.model.dto.StudentDto;
import com.selimhorri.pack.model.entity.Student;

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





