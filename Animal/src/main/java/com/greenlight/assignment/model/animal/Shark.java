package com.greenlight.assignment.model.animal;

import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;

public class Shark extends Fish
{
	 private final AnimalType.SIZE SIZE = AnimalType.SIZE.LARGE;
	 private final AnimalType.COLOR COLOR = AnimalType.COLOR.GREY;

	 @PrintableAnnotation
	 public String eat(Fish fish)
	 {
		 String msg="Eating fish : "+fish;

		 fish=null;
		 return msg;
	 }

	public AnimalType.SIZE getSIZE() {
		return SIZE;
	}

	public AnimalType.COLOR getCOLOR() {
		return COLOR;
	}
	 
	@Override
	public String getActions() {
		String msg=PrintableMethods.printAllMethods(Shark.class, this);

		return msg;
	}	 
}