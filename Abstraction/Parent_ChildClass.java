package com.java.Abstraction;

public class Parent_ChildClass extends ParentClass 
{
	@Override
	public void m2() 
	{
		System.out.println("iam abstract method of parent implemented in child");
	}
	public static void main(String[] args) 
	{
		ParentClass pc=new Parent_ChildClass();
		 pc.m1();
		 pc.m2();
	}

}
