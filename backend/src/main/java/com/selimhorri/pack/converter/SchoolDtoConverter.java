package com.selimhorri.pack.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.selimhorri.pack.model.dto.SchoolDto;
import com.selimhorri.pack.model.entity.School;

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






