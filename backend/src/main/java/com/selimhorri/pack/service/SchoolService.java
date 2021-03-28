package com.selimhorri.pack.service;

import java.util.List;

import com.selimhorri.pack.model.entity.School;

public interface SchoolService {
	
	List<School> findAll();
	School findById(final Integer schoolId);
	School save(final School school);
	School update(final School school);
	void deleteById(final Integer schoolId);
	void delete(final School school);
	
}





