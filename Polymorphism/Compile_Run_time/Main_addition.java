package com.java.Polymorphism.Compile_Run_time;

public class Main_addition 
{
	public static void main(String[] args) 
	{
		Addition addition=new Addition();
		addition.add(10,1);
		addition.add(15.5, 9.5f);
		double result =addition.sum(15.5, 24.5);
		System.out.println(result);
		
	}
}
