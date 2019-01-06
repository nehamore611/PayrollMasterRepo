package com.payroll.emp.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.payroll.emp.core.Address;
import com.payroll.emp.core.Employee;
import com.payroll.emp.core.exception.EmployeeNotFoundException;

public class EmployeeServiceByMAP {
	Map<Integer,Employee> empMap = new HashMap<>();
	
	public void addEmployee(Employee e)
	{	
		empMap.put(e.getId(),e);
	}

	public Employee Searchdisplay(int id)throws EmployeeNotFoundException {
	
		if (empMap.containsKey(id))
		{
			Employee e = empMap.get(id);
			return(e);
		}
		
		else
			throw new EmployeeNotFoundException("Employee Not Found");  
		
		}
	

	public void displayAllEmployees()
	{
		System.out.println("List of Employee");
		

		for(Entry<Integer, Employee> e:empMap.entrySet()){
			int empid=e.getKey();
			Employee val=e.getValue();
			Address addr=val.getAdr();
			System.out.println("\nEmployee id :"+empid);
			System.out.println("\nEmployee name :"+val.getName() + "\n Employee age :"+val.getAge() +"\n Employee Salary :"+val.getSalary() +"\n Employee Address :"+addr.getCity() +" "+addr.getPin()+"\n\n\n");
		}
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
}


