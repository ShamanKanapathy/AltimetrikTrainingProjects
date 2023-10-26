package com.alti.ems.controller;

import com.alti.ems.entity.empEntity;
import com.alti.ems.Service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeeExperience")
public class empController {
    @Autowired
    private  IEmpService employeeService;

//    @Autowired
//    public empController(IEmpService employeeService) {
//        this.employeeService = employeeService;
//    }
    @GetMapping("/experience")
    public List<empEntity> getEmployeeAllocationByExperience() {
        return employeeService.getEmployeeAllocationByExperience();
    }
}
