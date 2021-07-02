package com.java.Abstraction;

public class InterfaceImplementation implements Interface1
{

	@Override
	public void m1()
	{
		System.out.println("implementation of  m1");
	}

	@Override
	public void m2() 
	{
		System.out.println("implementation of m2");
	}
	public static void main(String[] args) 
	{
		InterfaceImplementation im=new InterfaceImplementation();
		im.m1();
		im.m2();
	}
}
