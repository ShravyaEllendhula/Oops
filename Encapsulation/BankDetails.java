package com.java.Encapsulation;

public class BankDetails 
{
	String bankName;
	String bankBranch;
	private int acNo;
	private double currentBal;
	private String bankType;
	private String ifscCode;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public double getCurrentBal() {
		return currentBal;
	}
	public void setCurrentBal(double currentBal) {
		this.currentBal = currentBal;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() 
	{
		return "BankDetails [bankName=" + bankName + ", bankBranch=" + bankBranch + ", acNo=" + acNo + ", currentBal="
				+ currentBal + ", bankType=" + bankType + ", ifscCode=" + ifscCode + "]";
	}
	
	
}
