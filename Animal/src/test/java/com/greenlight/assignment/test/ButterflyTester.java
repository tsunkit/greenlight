package com.greenlight.assignment.test;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.greenlight.assignment.model.animal.Butterfly;

public class ButterflyTester {
	
	Butterfly butterfly = new Butterfly();
	
	@Test
	public void testButterflyMetamorphosis()
	{
	
		System.out.println("\nTesting Butterfly Metamorphosis");
		System.out.println("Testing Butterfly by default");
		butterfly.showState();
		butterfly.getActions();
		
		System.out.println("\nTesting Butterfly before Metamorphosis and do Metamorphosis");
		butterfly.doMetamorphosis();
		butterfly.showState();
		butterfly.getActions();
	
		System.out.println("\nTesting Butterfly after Metamorphosis and do Metamorphosis");
		butterfly.doMetamorphosis();
		butterfly.showState();
		butterfly.getActions();
	}
	
   public static void main(String[] args) 
   {
	      Result result = JUnitCore.runClasses(ButterflyTester.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println("Test Result :" +result.wasSuccessful());
   }
}
