package com.service;

import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	public String storeEmployee(Employee emp) {
		EmployeeDao ed = new EmployeeDao();
		if(ed.storeEmployeeDetails(emp)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
		
	}
	
	public List<Employee> getAllEmployee() {
		EmployeeDao ed = new EmployeeDao();
		return ed.getAllEmployee();
	}
}
