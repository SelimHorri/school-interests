package com.selimhorri.pack.services;

import java.util.List;

import com.selimhorri.pack.models.entities.School;

public interface SchoolService {
	
	List<School> findAll();
	School findById(final Integer schoolId);
	School save(final School school);
	School update(final School school);
	void deleteById(final Integer schoolId);
	void delete(final School school);
	
}





