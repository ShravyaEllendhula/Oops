package com.java.Polymorphism.Overloading;

public class Overloading_TypePromotion1 
{
	public void sum(int i,double d)
	{
		System.out.println("iam from  sum method "+(i+d));
	}
	public void sum(int a,double d1,double d2)
	{
		System.out.println("iam from overloaded sum method "+(a+d1+d2));
	}
	public void sum(int j, float f)
	{
		System.out.println("iam 2nd overloaded sum method "+(j+f));
	}
	public static void main(String[] args) 
	{
		Overloading_TypePromotion1 ot= new Overloading_TypePromotion1();
		ot.sum(10, 14.5f);
		 
	}
}
