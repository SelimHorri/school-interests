package com.selimhorri.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.selimhorri.pack.model.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
	
	
	
}






