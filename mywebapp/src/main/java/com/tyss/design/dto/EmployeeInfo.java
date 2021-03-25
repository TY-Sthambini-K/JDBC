package com.tyss.design.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table (name="employee_info")
public class EmployeeInfo implements Serializable{
	@Id
	@Column
	private int eid;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private long mobile;
	@Column
	private String designation;
	@Column
	private Date doj;
	@Column
	private int salary;
	@Column
	private Date dob;
	@Column
	private String bloodgroup;
	@Column
	private int age;
	@Column
	private int deptid;
	@Column
	private String govtid;
	@Column
	private String gender;
	@Column
	private String status;
	@Column
	private int experience;
	@Column
	private int comm;
	@Column
	private String mgr;
	@Column
	private int mgrno;
	@Column
	private int isenable;
}
