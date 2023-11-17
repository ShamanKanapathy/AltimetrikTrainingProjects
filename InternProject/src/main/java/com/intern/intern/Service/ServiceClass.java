package com.intern.intern.Service;

import com.intern.intern.entity.EmpAllocation;
import com.intern.intern.repository.RepositoryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ServiceClass {

    @Autowired
    private RepositoryClass E_repo;

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
                return new ResponseEntity<>(result, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Invalid: No matching records found for Employee Code", HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<>("Invalid: Employee code is invalid", HttpStatus.BAD_REQUEST);
        }
    }

//    public List<EmpAllocation> findByProjectName(String empCode, int offset, int limit) {
//        List<EmpAllocation> resultList = E_repo.findByProjectName(empCode,Pageable.unpaged());
//        int startIndex = offset * limit;
//        int endIndex = Math.min(startIndex + limit, resultList.size());
//        return resultList.subList(startIndex, endIndex);
//    }
//}
    public List<EmpAllocation> findByProjectName(String empCode, int offset, int limit) {
        Pageable pageable = PageRequest.of(offset, limit);
        List<EmpAllocation> resultList = E_repo.findByProjectName(empCode, pageable);
        return resultList;
    }
}