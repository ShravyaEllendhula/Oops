package com.java.Polymorphism.Compile_Run_time;

public class Addition 
{
	public void add(int a,byte b)
	{
		System.out.println("sum of "+a+","+b+" is: "+(a+b));
	}
	public void add(double d,float f)
	{
		System.out.println("sum of "+d+","+f+" is: "+(d+f));
	}
	public double sum(double d1,double d2)
	{
		System.out.println("sum of "+d1+","+d2+" is: ");
		return d1+d2;
	}
}
