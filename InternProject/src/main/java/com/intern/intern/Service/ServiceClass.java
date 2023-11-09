package com.intern.intern.Service;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.intern.intern.entity.EmpAllocation;
import com.intern.intern.repository.RepositoryClass;

@Service
public class ServiceClass {

    @Autowired
    RepositoryClass E_repo;

    public ResponseEntity<?> getEmpList1(String assignmentStatus) {
        if (Objects.nonNull(assignmentStatus)) {
            List<EmpAllocation> result = E_repo.findByAssignmentStatus(assignmentStatus);
            if (result != null && !result.isEmpty()) {
                return new ResponseEntity<>(result, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Invalid: No matching records found for Assignment Status", HttpStatus.BAD_REQUEST);
            }
        } else {
        	return new ResponseEntity<>("Invalid: Assignment status is invalid", HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<?> getEmpList(String empCode) {
        if (Objects.nonNull(empCode)) {
            List<EmpAllocation> result = E_repo.findByEmpCode(empCode);
            if (result != null && !result.isEmpty()) {
                return new ResponseEntity<> (result,HttpStatus.OK);
            } else {
                return new ResponseEntity<> ("Invalid: No matching records found for Employee Code",HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<>("Invalid: Employee code is invalid",HttpStatus.BAD_REQUEST);
        }
        
        
    }
    
}
        
        



