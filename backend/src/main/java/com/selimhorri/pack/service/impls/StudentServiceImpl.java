package com.selimhorri.pack.service.impls;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selimhorri.pack.converter.StudentConverter;
import com.selimhorri.pack.exception.wrapper.StudentNotFoundException;
import com.selimhorri.pack.model.dto.StudentDto;
import com.selimhorri.pack.model.entity.Student;
import com.selimhorri.pack.repository.StudentRepository;
import com.selimhorri.pack.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	private final StudentRepository rep;
	private final StudentConverter studentConverter;
	
	@Autowired
	public StudentServiceImpl(final StudentRepository rep, final StudentConverter studentConverter) {
		this.rep = rep;
		this.studentConverter = studentConverter;
	}
	
	@Override
	public List<Student> findAll() {
		return this.rep.findAll();
	}
	
	@Override
	public Student findById(final Integer studentId) {
		return this.rep.findById(studentId).orElseThrow(() -> new StudentNotFoundException("########## School not found ##########"));
	}
	
	@Override
	public Student save(final StudentDto studentDto) {
		return this.rep.save(this.studentConverter.convert(studentDto));
	}
	
	@Override
	public Student save(final Student student) {
		return this.rep.save(student);
	}
	
	@Override
	public Student update(final StudentDto studentDto) {
		return this.rep.save(this.studentConverter.convert(studentDto));
	}
	
	@Override
	public Student update(final Student student) {
		return this.save(student);
	}
	
	@Override
	public void deleteById(final Integer studentId) {
		this.rep.deleteById(studentId);
	}

	@Override
	public void delete(Student student) {
		this.rep.delete(this.findById(student.getStudentId()));
	}
	
	
	
}






