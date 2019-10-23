package com.greenlight.assignment.model.animal;

import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;

public class ClownFish extends Fish
{
	 private final AnimalType.SIZE SIZE = AnimalType.SIZE.SMALL;
	 private final AnimalType.COLOR COLOR = AnimalType.COLOR.ORANGE;
	 
	 @PrintableAnnotation
	 public String makeJokes()
	 {
		 String msg="if my jokes make me a Jokerfish, then Batfish is gonna stop me....";
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
		String msg=PrintableMethods.printAllMethods(ClownFish.class, this);

		return msg;
	}
} 