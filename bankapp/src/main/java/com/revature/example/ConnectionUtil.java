package com.revature.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class ConnectionUtil {

	private ConnectionUtil() {
		super();
	}
	
	public static Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new Driver());
		
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "junior16";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		return connection;
	}
}
