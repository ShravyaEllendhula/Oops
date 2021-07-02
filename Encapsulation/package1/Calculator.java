package com.java.Encapsulation.package1;

public class Calculator 
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		System.out.println(c.add(12, 14));
	}
}
