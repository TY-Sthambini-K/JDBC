package com.tyss.design.service;

import java.util.List;

import com.tyss.design.dao.EmployeeDAO;
import com.tyss.design.dao.EmployeeDAOFactory;
import com.tyss.design.dao.EmployeeDAOImplementation;
import com.tyss.design.dto.EmployeeInfo;

public class EmployeeService implements EmployeeDeaignService {
	EmployeeDAO emp=EmployeeDAOFactory.getInstance();
	public EmployeeInfo getDetailsFromId(int eid) {
		// TODO Auto-generated method stub
		if(eid != 0) {
			return emp.getDetailsFromId(eid);
		}else {
			return null;
		}
		
	}

	public boolean deleteByEmployeeId(int eid) {
		return emp.deleteByEmployeeId(eid);
	}

	public boolean createEmployeeDetail(EmployeeInfo employee) {
		if(employee!=null) {
			boolean value1 = emp.createEmployeeDetail(employee);
			System.out.println("created " +value1);
		}
		return false;
	}

	public boolean updateEmployeeDetail(EmployeeInfo info) {
		// TODO Auto-generated method stub
		Boolean value=emp.updateEmployeeDetail(info);
		System.out.println(value);
		System.out.println("updated");
		return false;
	}

	public List<EmployeeInfo> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return emp.getAllEmployeeDetails();
		
	}

}
