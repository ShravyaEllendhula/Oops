package com.java.Inheritance;

public class JavaFacaulty extends Facaulty
{
	String fSubject="java";
	String fName="sureshgaaru";
	public static void main(String[] args)
	{
		
		JavaFacaulty facaulty=new JavaFacaulty();
		System.out.println(facaulty.instituteName);
		System.out.println(facaulty.fdesignation);
		System.out.println(facaulty.fSubject);
		System.out.println(facaulty.fName);
		facaulty.does();
		
		
	}
}
