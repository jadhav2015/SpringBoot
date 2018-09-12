package com.dev.controller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dao.EmployeeServiceImpl;
import com.dev.service.Employee;
import com.google.gson.Gson;

@RestController
public class EmployeeController 
{

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeServiceImpl empService;
	@Autowired
	Gson gson;
	
	
	@GetMapping(path="/getEmployeeDetails",produces = "application/json")
	public String getEmployeeDetails(@RequestParam String id) throws ClassNotFoundException
	{

		String response = empService.findEmpDetails(1);

		log.info("" + response);

		return response;
	}

	@PostMapping(path="/setEmpDetails", consumes = "application/json", produces = "application/json" )
	public String insertInfo(@RequestBody String data ) 
	{
		
		Employee  emp=gson.fromJson(data, Employee.class);
	    String response=empService.insertEmployeeDetails(emp);
	  
		return gson.toJson(response);
	}

	@PostMapping("/updateEmpDetails")
	public String updateInfo(@RequestBody String data) {

		Employee  emp=gson.fromJson(data, Employee.class);
	    String response=empService.insertEmployeeDetails(emp);
	  
		return gson.toJson(response);

	}

	@PostMapping("/deleteEmpDetails")
	public String deleteInfo(@RequestBody String data) 
	{
		Employee  emp=gson.fromJson(data, Employee.class);
		
	    String response=empService.deleteEmployeeDetails(emp);
	  
		return gson.toJson(response);

	}

}
