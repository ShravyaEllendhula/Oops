package com.java.Constructor;

public class ChildClass extends SuperClass
{
	public ChildClass()
	{
		System.out.println("iam child class constructor");
	}
	public static void main(String[] args) 
	{
		new ChildClass();
	}
}
