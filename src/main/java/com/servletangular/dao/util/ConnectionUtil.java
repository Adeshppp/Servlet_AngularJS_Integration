package com.servletangular.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		
	public static Connection getNewConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/employee_db?createDatabaseIfNotExist=true";
		String userName = "root";
		String password = "password";
		return DriverManager.getConnection(url, userName, password);
	}
}
