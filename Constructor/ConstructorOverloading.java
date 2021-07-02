package com.java.Constructor;

public class ConstructorOverloading 
{
	int id;
	String name;
	String designation;
	double salary;
	public ConstructorOverloading(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	public ConstructorOverloading(int id, String name,String designation,double salary) 
	{
		this.id = id;
		this.name = name;
		this.designation=designation;
		this.salary=salary;
	}
    public static void main(String[] args) 
    {
    	ConstructorOverloading constructorOverloading=new ConstructorOverloading(1122, "sai");
    	ConstructorOverloading constructorOverloading1=new ConstructorOverloading(1133,"shravya","IT-employe",12.5);		
    }
	
	
}
