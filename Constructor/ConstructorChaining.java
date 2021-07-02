package com.java.Constructor;

public class ConstructorChaining 
{
	int id;
	String name;
	String addres;
	public ConstructorChaining(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	public ConstructorChaining(int id, String name, String addres) 
	{
		this(id,name);
		this.addres = addres;
	}
	public void displayInfo()
	{
		if(addres==null)
		{
			System.out.println("id= "+id+" name= "+name  );
		}
		else
		{
			 
			System.out.println("id= "+id+" name= "+name+ "address= "+addres);
			
		}
		
	}
	public static void main(String[] args) 
	{
		ConstructorChaining chaining=new ConstructorChaining(1133, "amulya");
		ConstructorChaining chaining1=new ConstructorChaining(1133, "anuhya","hyd");
		chaining.displayInfo();
		
		chaining1.displayInfo();
	}
	
}
