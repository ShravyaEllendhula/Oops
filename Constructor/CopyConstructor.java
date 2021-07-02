package com.java.Constructor;

public class CopyConstructor
{
	int idNo;
	double salary;
	String name;
	public CopyConstructor(int idNo, double salary, String name) 
	{
		this.idNo = idNo;
		this.salary = salary;
		this.name = name;
	}
	public CopyConstructor(CopyConstructor c)
	{
		this.idNo =c.idNo;
		this.salary=c.salary;
		this.name=c.name;
	}
	public void showInfo()
	{
		System.out.println("id-number is: "+idNo+" salary is: "+salary+" name is: "+name);
	}
	
	public static void main(String[] args) 
	{
		CopyConstructor constructor=new CopyConstructor(1122,123.5,"anuhya");
		CopyConstructor constructor1=new CopyConstructor(constructor);
		constructor.showInfo();
		constructor1.showInfo();
		
	}
}
