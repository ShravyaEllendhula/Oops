package com.java.Polymorphism.Overloading;

public class Overloading_TypePromotion 
{
	public void sum(int i,double d)
	{
		System.out.println("iam from sum method "+(i+d));
	}
	public void sum(int a,double d1,double d2)
	{
		System.out.println("iam from overloaded sum method "+(a+d1+d2));
	}
	public static void main(String[] args) 
	{
		Overloading_TypePromotion ot= new Overloading_TypePromotion();
		ot.sum(10, 15.0f);
	}
}
