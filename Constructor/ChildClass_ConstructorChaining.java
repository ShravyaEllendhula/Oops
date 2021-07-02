package com.java.Constructor;

public class ChildClass_ConstructorChaining extends SuperClass_chaining
{
	double salary;
	public ChildClass_ConstructorChaining(int Eid, String Ename,double salary) 
	{
		super(Eid, Ename);
		this.salary=salary;
	}

	@Override
	public String toString() 
	{
		return "ChildClass details [salary=" + salary + ", EId=" + EId + ", Ename=" + Ename+"]";
	}

	public static void main(String[] args) 
	{
		SuperClass_chaining chaining=new SuperClass_chaining(1144, "shravya");
		ChildClass_ConstructorChaining s=	new ChildClass_ConstructorChaining(1133, "sai", 1.5);
		System.out.println(chaining);
		System.out.println(s);
	}
}
