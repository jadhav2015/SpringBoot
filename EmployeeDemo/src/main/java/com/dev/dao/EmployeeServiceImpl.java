package com.dev.dao;

import java.util.ArrayList;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.controller.EmployeeController;
import com.dev.service.Employee;
import com.google.gson.Gson;

@Service
public class EmployeeServiceImpl implements EmpService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	Gson gson;

	JSONObject object = new JSONObject();

	private static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Override
	public String findEmpDetails(int id) {
		// TODO Auto-generated method stub
		Iterable<Employee> emplist = new ArrayList<Employee>();

		try {

			emplist = employeeRepository.findById(id);

			for (Employee emp : emplist) {
				object.put("id", emp.getId());
				object.put("name", emp.getName());
				object.put("salary", emp.getSalary());

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return gson.toJson(object);
	}

	public String insertEmployeeDetails(Employee emp) {

		String response;

		emp = employeeRepository.save(emp);

		if (emp != null) 
		{
			response = "employee details saved successfuly" + emp.getName();
			log.info("employeeResponse" + response);
			return response;

		} 
		else 
		{
			response = "unable to save employee details";
			return response = "unable to save employee details";
		}

	}

	public String updateEmployeeDetails(Employee emp) 
	{

		String response;

		emp = employeeRepository.save(emp);

		if (emp != null) {
			response = "employee details saved successfuly " + emp.getName();
			log.info("employeeResponse" + response);
			return response;

		} else {
			response = "unable to update   details";
			return response = "unable to save employee details";
		}
	}

	public String deleteEmployeeDetails(Employee emp) 
	{

		String response;
		employeeRepository.delete(emp);
		response ="record deleted successfuly";
		return response = "unable to save employee details "+emp.getName();

	}

}
