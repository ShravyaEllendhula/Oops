package com.java.Abstraction;

public class Dog extends Animal
{

	@Override
	public void sound() 
	{
		System.out.println("dog barks like woof woof");
	}
	
	public static void main(String[] args) 
	{
		Animal ad=new Dog();
		ad.sound();
	}

}
