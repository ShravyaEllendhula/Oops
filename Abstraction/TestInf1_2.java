package com.java.Abstraction;

public class TestInf1_2 implements Inf1,inf2
{

	@Override
	public void a1() 
	{
		System.out.println("hi iam from a1");
	}

//	@Override
//	public void b1() 
//	{
//		 System.out.println("return type of 2 methods not same");
//		
//	}
	public static void main(String[] args) 
	{
		TestInf1_2 t1=new TestInf1_2();
		t1.a1();
		//System.out.println(a);//invalid
		System.out.println(Inf1.a);
		System.out.println(inf2.a);
		
		
	}

}
