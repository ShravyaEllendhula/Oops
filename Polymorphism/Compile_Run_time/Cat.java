package com.java.Polymorphism.Compile_Run_time;

public class Cat extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("cats sound is meowww");
	}
	public static void main(String[] args) 
	{
		Animal animal=new Cat();
		animal.sound();
	}
}
