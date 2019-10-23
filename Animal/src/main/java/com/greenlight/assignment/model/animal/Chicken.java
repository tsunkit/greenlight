package com.greenlight.assignment.model.animal;

import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;

public class Chicken  extends PhasianidaeFamily
{

	@Override @PrintableAnnotation
	public String say() {
		String msg="Cluck, cluck";
		return msg;
	}


	@Override @PrintableAnnotation
	public String walk() {
		String msg="I'm walking";
		return msg;
	}



	@Override
	public String getActions() {
		String msg=PrintableMethods.printAllMethods(Chicken.class, this);

		return msg;
	}


}	