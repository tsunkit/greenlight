package com.greenlight.assignment.model;


public class  Phone implements Soundable
{

	@Override
	public String say() {
		String msg="Ring...ring...";
		return msg;
	}

}	
