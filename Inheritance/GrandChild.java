package com.java.Inheritance;

public class GrandChild extends Child
{
	public GrandChild()
	{
		System.out.println("hii all iam from grand-child constructor");
	}
	public void display()
	{
		System.out.println("hi all iam from grandchild class method");
		super.display();
	}
	public static void main(String[] args) 
	{
		GrandChild child=new GrandChild();
		child.display();
	}
}
