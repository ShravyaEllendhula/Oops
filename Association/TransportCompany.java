package com.java.Association;

public class TransportCompany 
{
	public static void main(String[] args) 
	{
		Driver driver=new Driver("Sai", "BMW", "TS1234");
		System.out.println(driver.driverName+" is driver of our "+driver.cBrandName+" car no is "+driver.cNo);
		
	}
}
