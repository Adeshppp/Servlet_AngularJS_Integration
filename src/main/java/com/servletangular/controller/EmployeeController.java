package com.servletangular.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;
import com.servletangular.beans.Employee;
import com.servletangular.service.EmployeeService;
import com.servletangular.service.impl.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private EmployeeService employeeService;
	
	@Override
	public void init() throws ServletException {
		super.init();
		employeeService = new EmployeeServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		List<Employee> employeeList = employeeService.findAll();
		PrintWriter printWriter = response.getWriter();
		response.setContentType("application.json");
		Gson gson = new Gson();
		if(employeeList.size()>0) {
			String jsonData = gson.toJson(employeeList);
			printWriter.print(jsonData);
		}
		printWriter.close();
	}
	
}
