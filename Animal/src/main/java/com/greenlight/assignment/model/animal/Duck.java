package com.greenlight.assignment.model.animal;

import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;

public class Duck extends AnatidaeFamily
{

	@Override @PrintableAnnotation
	public String swim() {
		String msg="I'm swimming";
		return msg;
	}

	@Override @PrintableAnnotation
	public String fly() {
		String msg="I'm flying";
		return msg;
	}

	@Override @PrintableAnnotation
	public String walk() {
		String msg="I'm walking";
		return msg;
	}
	
	@Override @PrintableAnnotation
	public String say() {
		String msg="Quack, quack";
		return msg;
	}
	


	@Override
	public String getActions() {
		String msg=PrintableMethods.printAllMethods(Duck.class, this);

		return msg;
	}



}
