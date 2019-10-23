package com.greenlight.assignment.model.animal;


import com.greenlight.assignment.model.animal.AnimalBehaviour.Swimmable;
import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;

public class Fish extends Animal implements Swimmable
{

	@Override @PrintableAnnotation
	public String swim() {
		String msg="I'm swimming";
		return msg;
	}

	@Override
	public String getActions() {
		String msg=PrintableMethods.printAllMethods(Fish.class, this);

		return msg;
	}
	 

	
}
