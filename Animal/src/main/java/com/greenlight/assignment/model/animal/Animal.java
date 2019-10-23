package com.greenlight.assignment.model.animal;



public abstract class Animal
{


	public String getName() {
		return this.getClass().getSimpleName();
	}
	
	public String getID() {
		return ""+hashCode();
	}
	
	public abstract String getActions();

}
