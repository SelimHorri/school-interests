package com.selimhorri.pack.service.impls;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selimhorri.pack.exception.wrapper.SchoolNotFoundException;
import com.selimhorri.pack.model.entity.School;
import com.selimhorri.pack.repository.SchoolRepository;
import com.selimhorri.pack.service.SchoolService;

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
		return this.rep.findById(schoolId).orElseThrow(() -> new SchoolNotFoundException("########## School not found ##########"));
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






