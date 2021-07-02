package com.java.Inheritance;

public class Employee extends Company
{
	String eName;
	String eDesignation;
	String eSalary;
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDesignation() {
		return eDesignation;
	}
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}
	public String geteSalary() {
		return eSalary;
	}
	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		 
		emp.setcName("TCS");
		emp.setcStrenth("10000");
		emp.seteName("shravya");
		emp.seteDesignation("Java-Developer");
		emp.seteSalary("3.6L");
		System.out.println("CompanyName: "+emp.getcName());
		System.out.println("Company-Strength: "+emp.getcStrenth());
		System.out.println("employeeName: "+emp.geteName());
		System.out.println("employeeDesignation: "+emp.geteDesignation());
		System.out.println("employeeSalary: "+emp.geteSalary());
		
		System.out.println("**************");
		Employee emp1=new Employee();
		 
		emp1.setcName("TCS");
		emp1.setcStrenth("10000");
		emp1.seteName("sai");
		emp1.seteDesignation("Testing-engineer");
		emp1.seteSalary("3.6L");
		System.out.println("CompanyName: "+emp1.getcName());
		System.out.println("Company-Strength: "+emp1.getcStrenth());
		System.out.println("employeeName: "+emp1.geteName());
		System.out.println("employeeDesignation: "+emp1.geteDesignation());
		System.out.println("employeeSalary: "+emp1.geteSalary());
		
	}
}
