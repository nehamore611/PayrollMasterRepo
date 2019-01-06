package com.payroll.emp.core;

public class Permanent extends Employee{
	public Permanent(int i, String n, int a, float sal, String c, int pin) {
		super(i, n, a, sal, c, pin);
		// TODO Auto-generated constructor stub
	}

	int basicSal;
	int hra;

	int calculateSalary(){
		return 10000;
	}
}
