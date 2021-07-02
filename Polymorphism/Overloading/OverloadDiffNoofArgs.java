package com.java.Polymorphism.Overloading;

public class OverloadDiffNoofArgs 
{
	public void show(String methodName)
	{
		System.out.println(methodName);
	}
	public void show(String methodName,String noOfArgs)
	{
		System.out.println(methodName+":"+noOfArgs);
	}
}
