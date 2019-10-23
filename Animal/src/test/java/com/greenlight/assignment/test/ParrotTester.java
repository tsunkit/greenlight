package com.greenlight.assignment.test;


import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.greenlight.assignment.model.Phone;
import com.greenlight.assignment.model.animal.*;

public class ParrotTester {
	
	Parrot parrot = new Parrot();
	
	@Test
	public void testParrotMimic()
	{
		System.out.println("\nTesting Parrot Mimic");
		Parrot parrotNearDog= new Parrot();
		System.out.println("\nParrot by default, Executing method : say");
		System.out.println(parrotNearDog.say());
		
		System.out.println("\nParrot living with Dog, Executing method : say");
		parrotNearDog.setLiveNearTo(new Dog());	
		System.out.println(parrotNearDog.say());
		
		System.out.println("\nParrot living with Cat, Executing method : say");
		Parrot parrotNearCat= new Parrot();
		parrotNearCat.setLiveNearTo(new Cat());	
		System.out.println(parrotNearCat.say());
		
		System.out.println("\nParrot living with Rooster, Executing method : say");
		Parrot parrotNearRooster= new Parrot();
		parrotNearRooster.setLiveNearTo(new Rooster());	
		System.out.println(parrotNearRooster.say());
		
		System.out.println("\nParrot living with Rooster without using inheritance, Executing method : say");
		Parrot parrotNearRooster2= new Parrot();
		parrotNearRooster2.setLiveNearTo(new RoosterDelegator(new Chicken()));	
		System.out.println(parrotNearRooster2.say());

		
		System.out.println("\nParrot living with Rooster, Executing method : say");
		Parrot parrotNearDuck= new Parrot();
		parrotNearDuck.setLiveNearTo(new Duck());	
		System.out.println(parrotNearDuck.say());
		
		System.out.println("\nParrot living near the phone, Executing method : say");
		Parrot parrotNearPhone= new Parrot();
		parrotNearPhone.setLiveNearTo(new Phone());	
		System.out.println(parrotNearPhone.say());	
	}
	
   public static void main(String[] args) 
   {
	      Result result = JUnitCore.runClasses(ParrotTester.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println("Test Result :" +result.wasSuccessful());
   }
}
