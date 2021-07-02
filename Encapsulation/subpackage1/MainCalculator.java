package com.java.Encapsulation.subpackage1;

import com.java.Encapsulation.package1.Calculator;

public class MainCalculator 
{
	public static void main(String[] args) 
	{
		Calculator c1=new Calculator();
		System.out.println(c1.add(12, 12));
	}
}
