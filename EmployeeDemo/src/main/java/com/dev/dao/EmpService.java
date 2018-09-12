package com.dev.dao;

import com.dev.service.Employee;

public interface EmpService 
{
	public String findEmpDetails(int id);
	public String insertEmployeeDetails(Employee emp);
	public String updateEmployeeDetails(Employee emp);
	public String deleteEmployeeDetails(Employee emp);
	

}
