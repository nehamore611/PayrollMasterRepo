package com.payroll.emp.client;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import com.payroll.emp.core.Employee;

public class EmployeeDetailsMap {
	public static void main(String[] args) {

//Add details			
		Employee e1=new Employee(4, "a", 24, 3, "nsk", 2345);
		Employee e2=new Employee(2, "b", 25, 4, "nsk", 2345);
		Employee e3=new Employee(3, "c", 26, 5, "nsk", 2345);
		Employee e4=new Employee(1, "d", 27, 6, "nsk", 2345);

//display details			
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		
//Hash Map			
		
		Map<Integer,Employee> mEmp=new TreeMap<Integer,Employee>();
		
		mEmp.put(e1.getId(),e1);
		mEmp.put(e2.getId(),e2);
		mEmp.put(e3.getId(),e3);
		mEmp.put(e4.getId(),e4);
		
		for(Entry<Integer, Employee> e:mEmp.entrySet()){
			int empid=e.getKey();
			Employee val=e.getValue();
			System.out.println("Employee id :"+empid);
			System.out.println("Employee name :"+val.getName() + " Employee age :"+val.getAge() +" Employee Salary :"+val.getSalary());
		}
	}
}
