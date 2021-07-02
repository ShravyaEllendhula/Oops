package com.java.Abstraction;

public class Abstract_Main extends AbstractDemo
{

	@Override
	public void demo2() 
	{
		System.out.println("hello all iam abstract method of abstractdemo-class");
	}
	public static void main(String[] args) 
	{
		//AbstractDemo d1=new AbstractDemo() ;
		Abstract_Main am=new Abstract_Main();
		am.demo1();
		am.demo2();
	}

}
