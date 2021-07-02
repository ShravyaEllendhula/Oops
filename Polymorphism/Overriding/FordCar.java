package com.java.Polymorphism.Overriding;

public class FordCar extends CarClass
{
	public int speedLimit()
    {
        return 150;
    }
    public static void main(String args[])
    {
    	CarClass obj = new FordCar();
    	int num= obj.speedLimit();
    	System.out.println("Speed Limit is: "+num);
    }
}
