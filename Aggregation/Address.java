package com.java.Aggregation;

public class Address 
{
	String Country;
	String State;
	String City;
	String Village;
	String streetNo;
	String houseNo;
	public Address(String country, String state, String city, String village, String streetNo, String houseNo) 
	{
		Country = country;
		State = state;
		City = city;
		Village = village;
		this.streetNo = streetNo;
		this.houseNo = houseNo;
	}
	@Override
	public String toString() 
	{
		return "[Country=" + Country + ", State=" + State + ", City=" + City + ", Village=" + Village
				+ ", streetNo=" + streetNo + ", houseNo=" + houseNo + "]";
	}
	
	
	
}
