package com.tyss.design.service;

import java.util.List;

import com.tyss.design.dto.EmployeeInfo;

public interface EmployeeDeaignService {
	public EmployeeInfo getDetailsFromId(int eid);
	public boolean deleteByEmployeeId(int eid);
	public boolean createEmployeeDetail(EmployeeInfo info);
	public boolean updateEmployeeDetail(EmployeeInfo info);
	public List<EmployeeInfo> getAllEmployeeDetails();
}
