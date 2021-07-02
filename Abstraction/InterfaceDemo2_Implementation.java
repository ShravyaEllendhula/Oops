package com.java.Abstraction;

public class InterfaceDemo2_Implementation implements InterfaceDemo2
{
	@Override
	public void demo1()
	{
		 System.out.println("iam implementation of interfaceDemo1-interface");
	}
	@Override
	public void demo2() 
	{
		System.out.println("iam implementation of interfaceDemo2-interface");
	}
	public static void main(String[] args) 
	{
		InterfaceDemo2 im2=new InterfaceDemo2_Implementation();
		im2.demo1();
		im2.demo2();
	}

}
