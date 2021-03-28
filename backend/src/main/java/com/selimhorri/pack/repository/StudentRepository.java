package com.selimhorri.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.selimhorri.pack.model.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	
}





