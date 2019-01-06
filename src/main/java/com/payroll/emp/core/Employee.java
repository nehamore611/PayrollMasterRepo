package com.payroll.emp.core;

//
public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;
	private float salary;
	Address adr;

	public Employee(int i, String n, int a, float sal,String c,int pin) {
		this.id = i;
		this.name = n;
		this.age = a;
		this.salary=sal;
		adr=new Address(c,pin);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}
	
	public void display() {
		System.out.println("Employee Details :");
		System.out.println(id + " " + name + " " + age + " " + getSalary());
	}
	
	public int compareTo(Employee e) {
		if (id > e.id) {
			return 1;
		} else if (id < e.id) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", adr=" + adr + "]";
	}
}
