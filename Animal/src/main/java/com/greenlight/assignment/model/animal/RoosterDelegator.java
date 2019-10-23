package com.greenlight.assignment.model.animal;


import com.greenlight.assignment.model.Soundable;
import com.greenlight.assignment.model.animal.AnimalBehaviour.Walkable;
import com.greenlight.assignment.model.util.PrintableAnnotation;
import com.greenlight.assignment.model.util.PrintableMethods;

public class RoosterDelegator extends Animal implements Soundable, Walkable
{
	private AnimalType.SEX sex = AnimalType.SEX.MALE;
	
	private AnimalType.LANG lang=AnimalType.LANG.English;
	
	private Chicken c;
	
	public RoosterDelegator(Chicken c) {
		super();
		this.c = c;
	}
	
	public String getSex()
	{
		return ""+sex;
	}

	public void setLang(AnimalType.LANG lang)
	{
		this.lang=lang;
	}
	
	public String getLang()
	{
		return ""+lang;
	}
	
	@PrintableAnnotation
	public String walk()
	{
		return c.walk();
	}
	
	@Override
	@PrintableAnnotation
	public String say()
	{
		String msg=null;
		switch(lang)
		{
			case Danish: msg="kykyliky"; break;
			case Dutch: msg="kukeleku"; break;
			case Finnish: msg="kukko kiekuu"; break;
			case French: msg="cocorico"; break;
			case German: msg="kikeriki"; break;
			case Greek: msg="kikiriki"; break;
			case Hebrew: msg="coo-koo-ri-koo"; break;
			case Hungarian: msg="kukuriku"; break;
			case Italian: msg="chicchirichi"; break;
			case Japanese: msg="ko-ke-kok-ko-o"; break;
			case Portuguese: msg="cucurucu"; break;
			case Russian: msg="kukareku"; break;
			case Swedish: msg="kuckeliku"; break;
			case Turkish: msg="kuk-kurri-kuuu"; break;
			case Urdu: msg="kuklooku"; break;
			case English: msg="Cock-a-doodle-doo";  break;
			default: assert false : "input lang not defined"; System.err.println("input lang not defined"); break;
		}

		return msg;
	}

	public String getActions() {
		String msg=PrintableMethods.printAllMethods(RoosterDelegator.class, this);

		return msg;
	}
}
