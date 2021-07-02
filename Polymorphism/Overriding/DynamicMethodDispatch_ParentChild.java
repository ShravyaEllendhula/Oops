package com.java.Polymorphism.Overriding;

public class DynamicMethodDispatch_ParentChild 
{
	public static void main(String[] args) 
	{
		ParentClass pc=new ParentClass();
		pc.display();
		ParentClass pc1=new ChildClass();
		pc1.display();
	}
}
