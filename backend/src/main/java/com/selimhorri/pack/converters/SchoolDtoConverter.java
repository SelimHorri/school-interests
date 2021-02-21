package com.selimhorri.pack.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.selimhorri.pack.models.dto.SchoolDto;
import com.selimhorri.pack.models.entities.School;

@Component
public class SchoolDtoConverter implements Converter<School, SchoolDto> {
	
	@Override
	public SchoolDto convert(final School source) {
		
		final SchoolDto schoolDto = new SchoolDto();
		schoolDto.setSchoolId(source.getSchoolId());
		schoolDto.setSchoolName(source.getSchoolName());
		schoolDto.setSchoolAdr(source.getSchoolAdr());
		
		return schoolDto;
	}
	
	
	
}






