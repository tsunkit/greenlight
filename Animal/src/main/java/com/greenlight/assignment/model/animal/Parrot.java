package com.greenlight.assignment.model.animal;

import com.greenlight.assignment.model.Soundable;
import com.greenlight.assignment.model.util.PrintableAnnotation;

public class Parrot extends Bird
{
	private Soundable isound;
	
	
	public void setLiveNearTo(Soundable isound)
	{
		this.isound=isound;
	}
	
	public Soundable getLiveNearTo()
	{
		return isound;
	}
	
	@Override
	@PrintableAnnotation
	public String say()
	{
		String msg="";
		if(isound==null)
		{
			isound=new Bird();
		}
		else
		{
			msg+="Mimicking...";
		}
		msg+=isound.say();
		
		return msg;
	}
}
