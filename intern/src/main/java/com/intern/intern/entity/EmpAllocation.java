package com.intern.intern.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_allocation")
public class EmpAllocation {
	
	@Id
	@Column(name="emp_code")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String empCode;

	private float booking_id;

	private String employee_first_name;

	
	private String employee_last_name;

	private String account_name;

	private String geography;

	private float total_hc;

	private String project_name;

	@Column(name="base_category")
	private String baseCategory;

	private String capability_center;

	private Date assignment_start_date;

	private Date assignment_end_date;

	private Date target_placement_date;

	private Date revised_target_placement_date;

	private Date on_bench_date;

	private String remarks;

	private String country;

	private String city;

	private String notes;

	private String engaged_in;

	private Date engaged_start_date;

	@Column(name="assignment_status")
	private String assignmentStatus;

	private String prj_sow_type;

	private double ns_project_code;

	private String client_number;

	private int benching_days;

	private Date created_date;

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public float getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(float booking_id) {
		this.booking_id = booking_id;
	}

	public String getEmployee_first_name() {
		return employee_first_name;
	}

	public void setEmployee_first_name(String employee_first_name) {
		this.employee_first_name = employee_first_name;
	}

	public String getEmployee_last_name() {
		return employee_last_name;
	}

	public void setEmployee_last_name(String employee_last_name) {
		this.employee_last_name = employee_last_name;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getGeography() {
		return geography;
	}

	public void setGeography(String geography) {
		this.geography = geography;
	}

	public float getTotal_hc() {
		return total_hc;
	}

	public void setTotal_hc(float total_hc) {
		this.total_hc = total_hc;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getBaseCategory() {
		return baseCategory;
	}

	public void setBaseCategory(String baseCategory) {
		this.baseCategory = baseCategory;
	}

	public String getCapability_center() {
		return capability_center;
	}

	public void setCapability_center(String capability_center) {
		this.capability_center = capability_center;
	}

	public Date getAssignment_start_date() {
		return assignment_start_date;
	}

	public void setAssignment_start_date(Date assignment_start_date) {
		this.assignment_start_date = assignment_start_date;
	}

	public Date getAssignment_end_date() {
		return assignment_end_date;
	}

	public void setAssignment_end_date(Date assignment_end_date) {
		this.assignment_end_date = assignment_end_date;
	}

	public Date getTarget_placement_date() {
		return target_placement_date;
	}

	public void setTarget_placement_date(Date target_placement_date) {
		this.target_placement_date = target_placement_date;
	}

	public Date getRevised_target_placement_date() {
		return revised_target_placement_date;
	}

	public void setRevised_target_placement_date(Date revised_target_placement_date) {
		this.revised_target_placement_date = revised_target_placement_date;
	}

	public Date getOn_bench_date() {
		return on_bench_date;
	}

	public void setOn_bench_date(Date on_bench_date) {
		this.on_bench_date = on_bench_date;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getEngaged_in() {
		return engaged_in;
	}

	public void setEngaged_in(String engaged_in) {
		this.engaged_in = engaged_in;
	}

	public Date getEngaged_start_date() {
		return engaged_start_date;
	}

	public void setEngaged_start_date(Date engaged_start_date) {
		this.engaged_start_date = engaged_start_date;
	}

	public String getAssignmentStatus() {
		return assignmentStatus;
	}

	public void setAssignmentStatus(String assignmentStatus) {
		this.assignmentStatus = assignmentStatus;
	}

	public String getPrj_sow_type() {
		return prj_sow_type;
	}

	public void setPrj_sow_type(String prj_sow_type) {
		this.prj_sow_type = prj_sow_type;
	}

	public double getNs_project_code() {
		return ns_project_code;
	}

	public void setNs_project_code(double ns_project_code) {
		this.ns_project_code = ns_project_code;
	}

	public String getClient_number() {
		return client_number;
	}

	public void setClient_number(String client_number) {
		this.client_number = client_number;
	}

	public int getBenching_days() {
		return benching_days;
	}

	public void setBenching_days(int benching_days) {
		this.benching_days = benching_days;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}


}
