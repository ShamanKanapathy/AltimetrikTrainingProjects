package com.intern.intern.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.intern.intern.entity.EmpAllocation;

import java.util.List;

@Repository
public interface RepositoryClass extends JpaRepository<EmpAllocation, String> {
	List<EmpAllocation> findByEmpCode(String empCode);

	List<EmpAllocation> findByAssignmentStatus(String assignmentStatus);

	@Query(value = "SELECT * FROM employee_allocation ea WHERE ea.base_category = ?1", nativeQuery = true)
	List<EmpAllocation> findByBaseCategory(String baseCategory);

	List<EmpAllocation> findByProjectName(String project_name, Pageable pageable);
}

