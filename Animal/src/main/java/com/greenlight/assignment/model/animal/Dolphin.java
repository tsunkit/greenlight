package com.greenlight.assignment.model.animal;

import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;

public class Dolphin extends AquaticMammalFamily
{

	@Override  @PrintableAnnotation
	public String swim() {
		String msg="I'm swimming";
		return msg;
	}



	@Override  @PrintableAnnotation
	public String say() {
		String msg="Click, click";
		return msg;
	}

	@Override 
	public String getActions() {
		String msg=PrintableMethods.printAllMethods(Dolphin.class, this);

		return msg;
	}
}