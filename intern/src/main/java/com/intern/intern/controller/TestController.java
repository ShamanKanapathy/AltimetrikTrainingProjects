package com.intern.intern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intern.intern.Service.ServiceClass;
@RestController
@RequestMapping("/api")

public class TestController {

	@Autowired
	ServiceClass serviceClass;

	@GetMapping("/getAll")
	
	public Object getStr1(@RequestParam(name="empCode", required=false) String empCode) {
		return serviceClass.getEmpList(empCode);
	}
	
	@GetMapping("/getSet")

	ResponseEntity<?> getStr(@RequestParam(name="assignmentStatus", required=false) String assignmentStatus) {
		return serviceClass.getEmpList1(assignmentStatus);
	}
		
	}


