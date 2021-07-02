package com.java.Abstraction;

public class TestSum_Main extends Sum
{

	@Override
	public int  sumTwo(int a, int b) 
	{
		return a+b;
	}

	@Override
	public int sumThree(int a, int b, int c) 
	{
		 
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		Sum s1	= new TestSum_Main(); 
		System.out.println(s1.sumTwo(10, 20));
		System.out.println(s1.sumThree(10, 20, 30));
		s1.display();
	}

}
