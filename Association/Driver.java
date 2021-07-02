package com.java.Association;

public class Driver extends Car
{
	String driverName;

	public Driver(String dname,String cBrandName, String cNo) 
	{
		super(cBrandName, cNo);
		this.driverName=dname; 
	}

}
