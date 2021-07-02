package com.java.Abstraction;

public class TestMultiply_interface implements Multiply
{

	@Override
	public int multiplyTwo(int a, int b)
	{
		return a*b;
	}

	@Override
	public int multiplyThree(int a, int b, int c) {
		 
		return a*b*c;
	}
	public static void main(String[] args) 
	{
		TestMultiply_interface tm=new  TestMultiply_interface();
		System.out.println(tm.multiplyTwo(12, 2));
		System.out.println(tm.multiplyThree(12, 2, 3));
	}
	
}
