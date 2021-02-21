package com.selimhorri.pack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.selimhorri.pack.models.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	
}





