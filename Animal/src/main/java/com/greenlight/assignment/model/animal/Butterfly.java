package com.greenlight.assignment.model.animal;


import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.greenlight.assignment.model.animal.AnimalBehaviour.*;
import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;

public class Butterfly  extends InsectFamily implements   Walkable,Flyable
{

	private ButterflyState butterflyState = new ButterflyBeforeMetamorphosis();
	
	public ButterflyState getButterflyState() {
		return butterflyState;
	}
	public void setButterflyState(ButterflyState butterflyState) {
		this.butterflyState = butterflyState;
	}

	public void doMetamorphosis()
	{
		butterflyState.metamorphosis(this);
	}
	
	
	public String showState()
	{
		
		return butterflyState.printState();
	}	
	
	@Override
	public String getActions() {
		String msg=PrintableMethods.printAllMethods(Butterfly.class, this);

		return msg;
	}
	
	@PrintableAnnotation
	public String walk()
	{
		String msg="";
		if(butterflyState instanceof ButterflyBeforeMetamorphosis)
			msg="I'm walking(crawling)";
		else
			msg="I'm walking";
		
		return msg;
	}
	
	@PrintableAnnotation
	public String fly()
	{
		String msg="";
		if(butterflyState instanceof ButterflyBeforeMetamorphosis)
		{
			msg="a caterpillar cannot fly";
			//assert false : "a caterpillar cannot fly";
		}
		else
			msg="I'm flying";
		return msg;
	}	
	
	@JsonIgnoreType
	private interface ButterflyState
	{
		
		void metamorphosis(Butterfly butterfly);
		String printState();
		
	}
	
	@JsonIgnoreType
	private class ButterflyBeforeMetamorphosis  implements ButterflyState
	{

		@Override
		public String printState() {
		
			String msg="Show Butterfly State :: I'm now a caterpillar";
			System.out.println(msg);
			return msg;
		}

		@Override
		public void metamorphosis(Butterfly butterfly) {
			System.out.println("metamorphosising.....\n");
			butterfly.setButterflyState(new ButterflyAterMetamorphosis());;
			
		}

	}
	
	@JsonIgnoreType
	private class ButterflyAterMetamorphosis implements ButterflyState
	{
		@Override
		public String printState() {
			String msg="Show Butterfly State :: I'm now a Butterfly";
			System.out.println(msg);
			return msg;
		}

		@Override
		public void metamorphosis(Butterfly butterfly) {
			System.out.println("Butterfly after Metamorphosis can no longer do Metamorphosis....\n");
			//	assert false : "Butterfly after Metamorphosis can no longer do Metamorphosis....";
			
		}
		
	}


}
