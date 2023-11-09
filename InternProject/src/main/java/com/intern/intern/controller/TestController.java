package com.intern.intern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intern.intern.SpringSecurity;
import com.intern.intern.Service.ServiceClass;
import com.intern.intern.entity.EmpAllocation;
import com.intern.intern.repository.RepositoryClass;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
@RestController
@RequestMapping("/api")

public class TestController {

	@Autowired
    ServiceClass serviceClass;
    @Autowired
    RepositoryClass E_repo;
    @Autowired
    SpringSecurity springSecurity;

    @ApiOperation(value = "Get a specific item", notes = "Provide an ID to get a specific item")
    @GetMapping("/getAll")
    public Object getStr1(@RequestParam(name = "empCode", required = false) String empCode) {
        return serviceClass.getEmpList(empCode);
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetched certificates successfully"),
            @ApiResponse(code = 404, message = "Bad request"),
            @ApiResponse(code = 403, message = "Internal Server Error")
    })
    @GetMapping("/getSet")
    public ResponseEntity<?> getStr(@RequestParam(name = "assignmentStatus", required = false) String assignmentStatus) {
        return serviceClass.getEmpList1(assignmentStatus);
    }

    @PutMapping("/changeEmployeeProject")
    public ResponseEntity<?> changeEmployeeProject(
            @RequestParam(name = "empCode") String empCode,
            @RequestBody ProjectUpdateDTO projectUpdateDTO) {
        if (empCode != null && projectUpdateDTO != null && projectUpdateDTO.getNewProject() != null) {
            List<EmpAllocation> existingEmployees = E_repo.findByEmpCode(empCode);
            if (existingEmployees != null && !existingEmployees.isEmpty()) {
                EmpAllocation employeeToUpdate = existingEmployees.get(0);
                employeeToUpdate.setProject_name(projectUpdateDTO.getNewProject());
                E_repo.save(employeeToUpdate);

                return ResponseEntity.ok("Employee's project updated successfully");
            } else {
                return new ResponseEntity<>("Invalid: No matching records found for Employee Code", HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<>("Invalid: Employee code or new project is invalid", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/changeEmployeeBaseCategory")
    public ResponseEntity<?> changeEmployeeBaseCategory(
            @RequestParam(name = "empCode") String empCode,
            @RequestBody BaseCategory baseCategory) {
        if (empCode != null && baseCategory != null && baseCategory.getNewBaseCategory() != null) {
            List<EmpAllocation> existingEmployees = E_repo.findByEmpCode(empCode);
            if (existingEmployees != null && !existingEmployees.isEmpty()) {
                EmpAllocation employeeToUpdate = existingEmployees.get(0);
                employeeToUpdate.setBaseCategory(baseCategory.getNewBaseCategory());
                E_repo.save(employeeToUpdate);

                return ResponseEntity.ok("Employee's Base Category is updated successfully");
            } else {
                return new ResponseEntity<>("Invalid: No matching records found for Employee Code", HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<>("Invalid: Employee code or new base category is invalid", HttpStatus.BAD_REQUEST);
        }
    }
    
    
    @PostMapping("/createEmployee")
    public ResponseEntity<?> createEmployee(@RequestBody EmpAllocation newEmployee) {
        if (newEmployee != null && newEmployee.getEmpCode() != null && newEmployee.getBaseCategory() != null) {
            List<EmpAllocation> existingEmployees = E_repo.findByEmpCode(newEmployee.getEmpCode());
            if (existingEmployees == null || existingEmployees.isEmpty()) {
                E_repo.save(newEmployee);
                return ResponseEntity.ok("Employee created successfully");
            } else {
                return new ResponseEntity<>("Employee with the same code already exists", HttpStatus.CONFLICT);
            }
        } else {
            return new ResponseEntity<>("Invalid: Employee data is incomplete or invalid", HttpStatus.BAD_REQUEST);
        }
    }
    
    
    @DeleteMapping("/deleteEmployee")
    public ResponseEntity<?> deleteEmployee(@RequestParam(name = "empCode") String empCode) {
        if (empCode != null) {
            List<EmpAllocation> existingEmployees = E_repo.findByEmpCode(empCode);
            if (existingEmployees != null && !existingEmployees.isEmpty()) {
                E_repo.delete(existingEmployees.get(0));
                return ResponseEntity.ok("Employee deleted successfully");
            } else {
                return new ResponseEntity<>("No matching records found for Employee Code", HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<>("Invalid: Employee code is missing", HttpStatus.BAD_REQUEST);
        }
    }



    }