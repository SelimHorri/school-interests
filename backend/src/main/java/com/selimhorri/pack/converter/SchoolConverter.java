package com.selimhorri.pack.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.selimhorri.pack.model.dto.SchoolDto;
import com.selimhorri.pack.model.entity.School;

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






