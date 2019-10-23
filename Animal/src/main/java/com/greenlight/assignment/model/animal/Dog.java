package com.greenlight.assignment.model.animal;

import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;

public class Dog extends CommonMammalFamily{


	@Override @PrintableAnnotation
	public String say() {
		String msg="Woof, woof";
		return msg;
	}

	@Override @PrintableAnnotation
	public String walk() {
		String msg="I'm walking";
		return msg;
	}

	@Override
	public String getActions() {
		String msg=PrintableMethods.printAllMethods(Dog.class, this);

		return msg;
	}


}
