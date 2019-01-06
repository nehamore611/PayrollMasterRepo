package com.payroll.emp.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.payroll.emp.core.Address;
import com.payroll.emp.core.Employee;
import com.payroll.emp.core.exception.EmployeeNotFoundException;

public class EmployeeService {
	//Connection con=OrcaleCon.getDBConnection();
	
	public void addEmployee(Employee e)
	{	
		try {			
			Statement stmt=OrcaleCon.getStatementConnection();
			 String sql = "INSERT INTO EMPLOYEE VALUES ("+e.getId()+",'"+e.getName()+"',"+e.getAge()+","+e.getSalary()+",'"+e.getAdr().getCity()+"',"+1+")";
	   	stmt.executeUpdate(sql);
	   	System.out.println("added");
	   	stmt.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}		
	}

	public void displayAllEmployees()
	{
			ResultSet rs;
			Statement stmt=OrcaleCon.getStatementConnection();
			try {
				rs = stmt.executeQuery("select * from employee");
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	}
/**
	public Employee Searchdisplay(int id)throws EmployeeNotFoundException {
	
		if (empMap.containsKey(id))
		{
			Employee e = empMap.get(id);
			return(e);
		}
		
		else
			throw new EmployeeNotFoundException("Employee Not Found");  
		
		}
	

	
	public void delete(int id) {
		empMap.remove(id);
	}
	

	public void modifyName(int id,String n) {
		Employee e = empMap.get(id);
		Address add = e.getAdr();
		e.setName(n);
		System.out.println("Modified Employee Details of :" + id);
		System.out.println("\n Id : " + e.getId() + "\n Name : " + e.getName() + "\n Age : " + e.getAge() + "\n Salary :"
				+ e.getSalary() + "\n Address :" + add.getCity() + " " + add.getPin() + "\n\n");
	}
**/
}


