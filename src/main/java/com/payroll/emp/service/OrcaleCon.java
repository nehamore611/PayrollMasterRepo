package com.payroll.emp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OrcaleCon {
	static Connection con;
	static Statement stmt;
	/*public static Connection getDBConnection(){
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","Employee","employee");  
	
	//		Statement stmt=con.createStatement();  
	//		con.close();  
		}
		catch(Exception e){ System.out.println(e);}
		return con;
	}*/
	
	public static Statement getStatementConnection(){
		
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","Employee","employee"); 
		stmt=con.createStatement();
	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return stmt;  
		
	}
}