package com.greenlight.assignment.test;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;

import com.greenlight.assignment.model.animal.AnimalBehaviour.*;

import com.greenlight.assignment.model.animal.*;
import com.greenlight.assignment.model.animal.Bird;


public class AnimalTester 
{
	Animal[] animals = new Animal[]{
			new Bird(),
			new Duck(),
			new Chicken(),
			new Rooster(),
			new RoosterDelegator(new Chicken()),
			new Dog(),
			new Cat(),
			new Parrot(),
			new Fish(),
			new Shark(),
			new ClownFish(),
			new Dolphin(),
			new Butterfly(),
			new Frog()
			};
	

	
	
	
	
	@Test
	public  void testAnimalDetails() 
	{	
		System.out.println("\nTest Animal Details");
		for( Animal animal : animals)
		{
			System.out.println( "Name : " + animal.getName() ) ;
			System.out.println( "Code : " + animal.getID() ) ;
			
			animal.getActions();
			
			System.out.println("");
		}
	}
	
	@Test
	public void testCountAnimal()
	{
		System.out.println("\nCounting Animals...." );
		List<Animal> animalList = Arrays.asList(animals);
		
		System.out.println("\nFinding total of Flyable Animal..." );
		long totalOfFlyableAnimal=animalList.stream()
									.filter( animal-> animal instanceof Flyable )
									.peek(System.out::println)
									.count();
		
		System.out.println("Total of Flyable Animal : "+ totalOfFlyableAnimal );
		
		System.out.println("\nFinding total of Walkable Animal..." );
		long totalOfWalkableAnimal=animalList.stream()
									.filter( animal-> animal instanceof Walkable )
									.peek(System.out::println)
									.count();
		
		System.out.println("Total of Walkable Animal : "+ totalOfWalkableAnimal );
		
		
		System.out.println("\nFinding total of Singable Animal..." );
		long totalOfSingableAnimal=animalList.stream()
									.filter( animal-> animal instanceof Singable )
									.peek(System.out::println)
									.count();
		
		System.out.println("Total of Walkable Animal : "+ totalOfSingableAnimal );
		
		System.out.println("\nFinding total of Swimmable Animal..." );
		long totalOfSwimmableAnimal=animalList.stream()
									.filter( animal-> animal instanceof Swimmable )
									.peek(System.out::println)
									.count();
		
		System.out.println("Total of Walkable Animal : "+ totalOfSwimmableAnimal );
	}
   public static void main(String[] args) 
   {
	      Result result = JUnitCore.runClasses(AnimalTester.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println("Test Result :" +result.wasSuccessful());
   }	
}



