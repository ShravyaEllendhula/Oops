package com.java.Polymorphism;

public class DemoCalculator 
{
	public static void main(String[] args) 
	{
		BasicCalculator bc=new BasicCalculator();
		System.out.println("sum of 2 args is: "+bc.add(10, 20));
		System.out.println("sum of 3 args is: "+bc.add(10, 20, 30));
	}
}
