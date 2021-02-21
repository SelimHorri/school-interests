package com.selimhorri.pack.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.selimhorri.pack.models.dto.SchoolDto;
import com.selimhorri.pack.models.entities.School;

@Component
public class SchoolConverter implements Converter<SchoolDto, School> {
	
	@Override
	public School convert(final SchoolDto source) {
		
		final School school = new School(
			source.getSchoolId(),
			source.getSchoolName(),
			source.getSchoolAdr()
		);
		
		return school;
	}
	
	
	
}






