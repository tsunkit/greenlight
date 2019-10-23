package com.greenlight.assignment.model.animal;

import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;

public class Frog extends AmphibiansFamily
{

	@Override @PrintableAnnotation
	public String walk() {
		String msg="I'm walking";
		return msg;
	}

	@Override  @PrintableAnnotation
	public String swim() {
		String msg="I'm swimming";
		return msg;
	}

	@Override
	public String getActions() {
		String msg=PrintableMethods.printAllMethods(Frog.class, this);

		return msg;
	}


	
}
