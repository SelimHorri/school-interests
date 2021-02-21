package com.selimhorri.pack.converters;

import java.time.LocalDate;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.selimhorri.pack.models.dto.StudentDto;
import com.selimhorri.pack.models.entities.Student;

@Component
public class StudentConverter implements Converter<StudentDto, Student> {
	
	@Override
	public Student convert(final StudentDto source) {
		
		final Student student = new Student();
		student.setStudentId(source.getSchoolId());
		student.setFirstName(source.getFirstName());
		student.setLastName(source.getLastName());
		student.setEnterDate(LocalDate.parse(source.getEnterDate()));
		student.setEmail(source.getEmail());
		student.setPhone(source.getPhone());
		student.getSchool().setSchoolId(source.getSchoolId());
		
		return student;
	}
	
	
	
}






