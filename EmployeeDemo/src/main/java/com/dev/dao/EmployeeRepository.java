package com.dev.dao;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dev.service.Employee;



@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> 
{

public List<Employee> findById(int id);
}
