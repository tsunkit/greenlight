package com.greenlight.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.greenlight.assignment.model.animal.Animal;
import com.greenlight.assignment.model.animal.Bird;
import com.greenlight.assignment.model.animal.AnimalBehaviour.Singable;

public class BirdTester {
	
	Bird bird = new Bird();
	@Test
	public  void testIfBirdSingable() 
	{
		boolean expectedResult=true;
		boolean actualResult= true;
		
		System.out.println("\nTest if bird singable ");

				
		 actualResult= bird instanceof Singable;
		System.out.println("Actual result is  : " + actualResult + ", expectedResult is "+expectedResult+"\n");
		
		assertEquals(expectedResult,actualResult );
	}
	
	
   public static void main(String[] args) 
   {
	      Result result = JUnitCore.runClasses(BirdTester.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println("Test Result :" +result.wasSuccessful());
   }		
}
