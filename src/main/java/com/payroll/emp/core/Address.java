package com.payroll.emp.core;

public class Address {
	String city;
	int pin;
	 
	Address(String c, int pin){
		this.city=c;
		this.pin=pin;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	public String getCity()
	{
		return this.city;
	}
	public int getPin()
	{
		return this.pin;
	}


}
