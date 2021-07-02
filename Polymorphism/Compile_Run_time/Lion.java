package com.java.Polymorphism.Compile_Run_time;

public class Lion extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("lion rowrsss");
	}
	public static void main(String[] args) 
	{
		Animal animal =new Lion();
		animal.sound();
	}
}
