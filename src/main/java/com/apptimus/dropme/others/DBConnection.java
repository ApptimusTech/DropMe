package com.apptimus.dropme.others;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/drop_me";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "";
		   
	Connection conn = null;
	Statement stmt = null;
   
	public Statement getCon() throws SQLException {
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		stmt = conn.createStatement();
		return stmt;  
	}

	public void closeCon() throws SQLException {
		stmt.close();
		conn.close();
	}
}
