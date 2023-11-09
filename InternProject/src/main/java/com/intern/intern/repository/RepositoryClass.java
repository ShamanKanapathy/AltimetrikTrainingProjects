package com.intern.intern.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.intern.intern.entity.EmpAllocation;


	
@Repository
public interface RepositoryClass extends JpaRepository <EmpAllocation, String> {

	List<EmpAllocation> findByEmpCode(String empCode);

	List<EmpAllocation> findByAssignmentStatus(String assignmentStatus);
	
	@Query(value = "SELECT * FROM  employee_allocation ea where ea.base_category = ?1", nativeQuery = true)
	List<EmpAllocation> findByBaseCategory(String baseCategory);
	
	

}

