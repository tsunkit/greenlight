package com.greenlight.assignment.model.animal;



public class AnimalBehaviour 
{
	public interface Walkable
	{
		public String walk();
	}
	
	public interface Flyable
	{
		public String fly();
	}
	
	public interface Swimmable
	{
		public String swim();
	}
	
	public interface Singable extends com.greenlight.assignment.model.Soundable
	{
		public String sing();
	}	
}
