package com.servletangular.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.servletangular.beans.Employee;
import com.servletangular.dao.EmployeeDAO;
import com.servletangular.dao.util.ConnectionUtil;
import com.servletangular.dao.util.SQLQueries;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public List<Employee> findAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<>();
		Connection connection = ConnectionUtil.getNewConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.SQL_SELECT_ALL_EMPLOYEE);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			int empId = resultSet.getInt(1);
			String name = resultSet.getString(2);
			double salary = resultSet.getDouble(3);
			String designation = resultSet.getString(4);
			String address = resultSet.getString(5);
			Employee employee = new Employee(empId, name, salary, designation, address);
			employeeList.add(employee);
		}
		return employeeList;
	}

	@Override
	public int save(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = ConnectionUtil.getNewConnection();
		return 0;
	}

}
