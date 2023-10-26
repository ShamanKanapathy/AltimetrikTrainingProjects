package com.alti.ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

//    @Getter
    @Data
    @Entity
    @Table(name = "employeeallocationncg")
    public class empEntity {

        @Id
        @Column(name = "Employee ID")
        private Long employeeId;

        @Column(name = "Employee Name")
        private String employeeName;


        @Column(name = "Project Name")
        private String projectName;


        @Column(name = "Total EXP (In Yrs)")
        private Double totalExperienceInYears;


    }


