package com.greenlight.assignment.model.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintableMethods 
{
	public static String printAllMethods(Class clss, Object obj) 
	{
		String result="I can do following actions: ";
		for(Method method : clss.getMethods())
		{
			if(method.getDeclaredAnnotations().length ==0 )
				continue;
			
			result+="Execute " +method.getName() + "(), result is ";
			//System.out.print( );

			try {
				if(method.getParameterCount()==0)
					result +=  (String) method.invoke(obj, null) +" | ";
				else if(method.getParameterCount()==1)
					result +=  (String) method.invoke(obj, new Object[] {null}) +" | ";
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(result);
		return result;
	}
}
