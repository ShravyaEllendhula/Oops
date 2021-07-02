package com.java.Aggregation;

public class Company 
{
	String cName;
	Address cAddress;
	public Company(String cName, Address cAddress) 
	{
		this.cName = cName;
		this.cAddress = cAddress;
	}
	@Override
	public String toString() 
	{
		return "Company [cName=" + cName + ", cAddress=" + cAddress + "]";
	}
	public static void main(String[] args) 
	{
		Address ad=new Address("INDIA", "TS", "HYD", "Gachibowly", "5","3-floor");
		Company company=new Company("TCS", ad);
		System.out.println(company);
	}
	
}
