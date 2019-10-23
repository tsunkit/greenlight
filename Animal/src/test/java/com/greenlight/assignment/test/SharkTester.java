package com.greenlight.assignment.test;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.greenlight.assignment.model.animal.ClownFish;
import com.greenlight.assignment.model.animal.Fish;
import com.greenlight.assignment.model.animal.Shark;


public class SharkTester {

	Shark shark = new Shark();
	
	@Test
	public void testSharkEat()
	{
		System.out.println("\nTesting Shark Eat");

		
		System.out.println("Executing method : eat ");
		System.out.println(shark.eat(new Fish()));
		System.out.println(shark.eat(new ClownFish()));
		System.out.println(shark.eat(new Shark()));
	}
	
   public static void main(String[] args) 
   {
	      Result result = JUnitCore.runClasses(SharkTester.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println("Test Result :" +result.wasSuccessful());
   }
}
