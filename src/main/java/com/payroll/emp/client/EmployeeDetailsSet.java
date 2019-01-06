package com.payroll.emp.client;

import java.util.TreeSet;

import com.payroll.emp.core.Employee;

public class EmployeeDetailsSet {

		public static void main(String args[]){
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
//Tree Set			
			TreeSet<Employee> tEmp=new TreeSet<Employee>();
			tEmp.add(e1);
			tEmp.add(e2);
			tEmp.add(e3);
			tEmp.add(e4);
			
			for(Employee e:tEmp){
				System.out.println("List of Employee");
				System.out.println(e.getId() +" "+e.getName()+" "+e.getAge()+" "+e.getSalary());
			}
						
		}
}
