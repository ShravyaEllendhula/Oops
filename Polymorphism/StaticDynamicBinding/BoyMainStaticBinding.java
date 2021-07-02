package com.java.Polymorphism.StaticDynamicBinding;

public class BoyMainStaticBinding extends Human_StaticBinding
{
	public static void walk()
	{
		System.out.println("Boy walks");
	}
	public static void main(String[] args) 
	{
		Human_StaticBinding hs=new BoyMainStaticBinding();
		Human_StaticBinding hs1=new Human_StaticBinding();
		hs.walk();
		hs1.walk();
		
	}
}
