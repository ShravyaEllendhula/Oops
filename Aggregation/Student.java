package com.java.Aggregation;

public class Student 
{
	String sName;
	int sId;
	Address sAddress;
	public Student(String sName, int sId, Address sAddress) 
	{
		this.sName = sName;
		this.sId = sId;
		this.sAddress = sAddress;
	}
	
	@Override
	public String toString() 
	{
		return "Student [sName=" + sName + ", sId=" + sId + ", sAddress=" + sAddress + "]";
	}

	public static void main(String[] args) 
	{
		Address sad=new Address("india", "TS","SRPT","Gottiparthy" , "2", "3-125");
		Student student=new Student("shravya", 1133, sad);
		System.out.println(student);
	}
}
