package com.java.Inheritance;

public class Company 
{
	String cName;
	String cStrenth;
	public String getcName() 
	{
		return cName;
	}
	public void setcName(String cName) 
	{
		this.cName = cName;
	}
	public String getcStrenth() 
	{
		return cStrenth;
	}
	public void setcStrenth(String cStrenth) 
	{
		this.cStrenth = cStrenth;
	}
	@Override
	public String toString() 
	{
		return "Company [cName=" + cName + ", cStrenth=" + cStrenth + "]";
	}
	
	
}
