package com.payroll.emp.service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.payroll.emp.core.Employee;
import com.payroll.emp.core.exception.EmployeeNotFoundException;

public class EmplyeeServiceTest {
	EmployeeServiceByMAP empService=new EmployeeServiceByMAP();

	@Before
	public void setup(){
		Employee e1=new Employee(4, "a", 24, 3, "nsk", 2345);
		empService.addEmployee(e1);
		Employee e2=new Employee(5, "a", 24, 3, "nsk", 2345);
		empService.addEmployee(e2);

	}
	
	@Test
	public void testSearchdisplay(){
		try {
			Employee e=empService.Searchdisplay(4);
			assertNotNull(e);
			assertEquals(4, e.getId());
			assertEquals("a", e.getName());
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(expected=EmployeeNotFoundException.class)	
	public void testSearchdisplay1() throws EmployeeNotFoundException{
			Employee e=empService.Searchdisplay(6);	
	}
	
	@Test
	public void testSearchdisplay3(){
		try {
			Employee e=empService.Searchdisplay(5);
			assertNotNull(e);
			assertEquals(5, e.getId());
			assertEquals("a", e.getName());
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
