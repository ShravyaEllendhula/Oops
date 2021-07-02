package com.java.Constructor;

public class ParameterizedConstructor 
{
	String name;
	String designation;
	public ParameterizedConstructor(String name, String designation) 
	{
		this.name = name;
		this.designation = designation;
		
	}
	
	@Override
	public String toString() 
	{
		return "ParameterizedConstructor [name=" + name + ", designation=" + designation + "]";
	}

	public static void main(String[] args) 
	{
		ParameterizedConstructor constructor=new ParameterizedConstructor("sai", "Developer");
		System.out.println(constructor);
	}
	
}
