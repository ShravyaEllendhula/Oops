package com.java.Aggregation;

public class College 
{
	String cName;
	Address cAddress;
	public College(String cName, Address cAddress) 
	{
		this.cName = cName;
		this.cAddress = cAddress;
	}
	@Override
	public String toString() 
	{
		return "College [cName=" + cName + ", cAddress=" + cAddress + "]";
	}
	
	public static void main(String[] args) 
	{
		Address ad=new Address("INDIA", "TS", "Nirmal", "Basar", "no-street", "not an house");
		College college=new College("RGUKT", ad);
		System.out.println(college);
	}
}
