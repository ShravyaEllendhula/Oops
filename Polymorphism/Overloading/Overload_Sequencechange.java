package com.java.Polymorphism.Overloading;

public class Overload_Sequencechange 
{
	public void addition(int i,double j)
	{
		System.out.println("sum is:"+(i+j));
	}
	public void addition(double i,int j)
	{
		System.out.println("sum is:"+(i+j));
	}
}
