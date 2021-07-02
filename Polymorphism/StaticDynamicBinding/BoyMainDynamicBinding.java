package com.java.Polymorphism.StaticDynamicBinding;

import com.java.Polymorphism.Overriding.Human;

public class BoyMainDynamicBinding extends HumanDynamicBinding
{
	public void walk()
	{
		System.out.println("boy walks");
	}
	public static void main(String[] args) 
	{
		HumanDynamicBinding hd=new BoyMainDynamicBinding();
		HumanDynamicBinding hd1=new HumanDynamicBinding();
		hd.walk();
		hd1.walk();
	}
}
