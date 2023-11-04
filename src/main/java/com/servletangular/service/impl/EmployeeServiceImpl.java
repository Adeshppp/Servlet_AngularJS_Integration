package com.servletangular.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.servletangular.beans.Employee;
import com.servletangular.dao.EmployeeDAO;
import com.servletangular.dao.impl.EmployeeDAOImpl;
import com.servletangular.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<>();
		try {
			employeeList = employeeDAO.findAll();
		}
		catch(Exception e) {
			System.err.println(e);
		}
		return employeeList;
	}

}
