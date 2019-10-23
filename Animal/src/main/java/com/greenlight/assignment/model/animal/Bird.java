package com.greenlight.assignment.model.animal;

import com.greenlight.assignment.model.animal.AnimalBehaviour.Singable;
import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;


public class Bird extends FlightBirdFamily implements Singable
{

	@Override
	@PrintableAnnotation
	public String say() {
		String msg="Tweet, tweet";
		return msg;
	}

	@Override
	@PrintableAnnotation
	public String fly() {
		String msg="I'm flying";
		return msg;
		
	}

	@Override
	@PrintableAnnotation
	public String walk() {
		String msg="I'm walking";
		return msg;
	}

	@Override
	@PrintableAnnotation
	public String sing() {
		String msg="I'm singing";
		return msg;		
	}

	@Override
	public String getActions() 
	{
		String msg=PrintableMethods.printAllMethods(Bird.class, new Bird());

		return msg;
	}



	
}

