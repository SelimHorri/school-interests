package com.selimhorri.pack.services.impls;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selimhorri.pack.models.entities.School;
import com.selimhorri.pack.repositories.SchoolRepository;
import com.selimhorri.pack.services.SchoolService;

@Service
@Transactional
public class SchoolServiceImpl implements SchoolService {
	
	private final SchoolRepository rep;
	
	@Autowired
	public SchoolServiceImpl(final SchoolRepository rep) {
		this.rep = rep;
	}
	
	@Override
	public List<School> findAll() {
		return this.rep.findAll();
	}
	
	@Override
	public School findById(final Integer schoolId) {
		return this.rep.findById(schoolId).orElseThrow();
	}
	
	@Override
	public School save(final School school) {
		return this.rep.save(school);
	}
	
	@Override
	public School update(final School school) {
		return this.rep.save(school);
	}
	
	@Override
	public void deleteById(final Integer schoolId) {
		this.rep.deleteById(schoolId);
	}

	@Override
	public void delete(School school) {
		this.rep.delete(this.findById(school.getSchoolId()));
	}
	
	
	
}






