package com.java.Constructor;

public class CopyValuesWithoutConstructor 
{
	int id;
	String name;
	public CopyValuesWithoutConstructor(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public CopyValuesWithoutConstructor() 
	{
		
	}
	public void display()
	{
		System.out.println(id+" "+name);
	} 
	public static void main(String[] args) 
	{
		CopyValuesWithoutConstructor constructor=new CopyValuesWithoutConstructor(1122,"shravya");
		CopyValuesWithoutConstructor constructor2=new CopyValuesWithoutConstructor();
		constructor2.id=constructor.id;
		constructor2.name=constructor.name;
		constructor2.display();
		constructor.display();
		
	}
	   
}
