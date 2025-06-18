package com.project.fixmyride.employeemodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@ToString 
@NoArgsConstructor
@AllArgsConstructor

@Table(name="employee_details")
public class EmployeeModel {
	@Id
	@Column(name="emp_id")
	private Integer empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_email")
	private String empEmail;
	@Column(name="emp_password")
	private String empPassword;
	@Column (name="emp_phone")
	private Long empPhone;
	@Column (name="emp_joindate")
	private String empJoinDate;
	@Column (name="emp_city")
	private String empCity;
	@Column (name="emp_state")
	private String empState;
}
