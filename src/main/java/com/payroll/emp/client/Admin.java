package com.payroll.emp.client;
import com.payroll.emp.core.Employee;
import com.payroll.emp.core.exception.EmployeeNotFoundException;
import com.payroll.emp.service.EmployeeService;
import com.payroll.emp.service.EmployeeServiceByMAP;
import java.util.Scanner;

public class Admin {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		EmployeeService empService=new EmployeeService();

		while(true)
		{
			System.out.println("1.Add Employee\n2.Find Employee \n3.Modify Employee Details\n4.Display Salary.\n5.Delete Employee.\n6.Display All Employee Details\n7.Exit:");
			int choice = sc.nextInt();
	
			switch(choice)
			{
				case 1:
					
					Employee e1=new Employee(4, "a", 24, 3, "nsk", 2345);
					empService.addEmployee(e1);

//					Employee e2=new Employee(2, "b", 25, 4, "nsk", 2345);
//					empService.addEmployee(e2);
//
//					Employee e3=new Employee(3, "c", 26, 5, "nsk", 2345);
//					empService.addEmployee(e3);
//
//					Employee e4=new Employee(1, "d", 27, 6, "nsk", 2345);
//					empService.addEmployee(e4);
					break;
//				case 2:
//					System.out.println("Enter the employee id to search the details :");
//					int empId=sc.nextInt();
//					try{
//						Employee e=empService.Searchdisplay(empId);
//					System.out.println(e.toString());			
//					}
//					catch(EmployeeNotFoundException m){System.out.println("Exception occured: "+m);}  
//					  
//					break;
//
//				case 3:
//					System.out.println("Enter the employee id to modify name of the Employee :");
//					empId=sc.nextInt();
//					System.out.println("Enter the employee name:");
//					String name=sc.next();
//					empService.modifyName(empId,name);
//					break;	
//				case 4:
//				//	Employee e5=new permanent(1, "d", 27, 6, "nsk", 2345);
//				//  empService.addEmployee(e4);
//					
//					break;
//				case 5:
//					System.out.println("Enter the employee id to Delete the details of Employee:");
//					empId=sc.nextInt();
//					empService.delete(empId);
//					break;
				case 6:
					System.out.println("All employee details :");
					empService.displayAllEmployees();
					break;
				case 7:
					System.exit(0);
			}

		}
	}
}
