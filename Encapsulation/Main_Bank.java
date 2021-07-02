package com.java.Encapsulation;

public class Main_Bank 
{
	public static void main(String[] args) 
	{
		BankDetails details=new BankDetails();
		
		details.setBankName("ICICI");
		details.setBankBranch("HYD");
		details.setBankType("Savings bank");
		details.setAcNo(1234567890);
		details.setCurrentBal(123456.9);
		details.setIfscCode("ABCD1234");
		
		System.out.println(details);//due to toString()
		
		System.out.println(details.getBankName());
		System.out.println(details.getBankBranch());
		System.out.println(details.getBankType());
		System.out.println(details.getAcNo());
		System.out.println(details.getCurrentBal());
		System.out.println(details.getIfscCode());
		
		
		
	}
}
