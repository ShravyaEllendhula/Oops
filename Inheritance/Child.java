package com.java.Inheritance;

public class Child extends Parent1
{
	public Child()
	{
		System.out.println("hello all iam from child-class constructor");
	}
	public void display()
	{
		System.out.println("hello all iam from child-class method");
		super.display();
	}
	public static void main(String[] args) 
	{
		Child child=new Child();
		child.display();
	}
}
