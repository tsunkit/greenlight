package com.greenlight.assignment.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;

import com.greenlight.assignment.model.animal.AnimalType;
import com.greenlight.assignment.model.animal.Chicken;
import com.greenlight.assignment.model.animal.Rooster;
import com.greenlight.assignment.model.animal.RoosterDelegator;

@RunWith(Parameterized.class)
public class RoosterTester {
	//Rooster rooster = new Rooster();
	RoosterDelegator rooster = new RoosterDelegator(new Chicken());
	private String input;
	private String expectedResult;
	
	   @Parameterized.Parameters
	   public static Collection<Object[]> prepareTestDataCollection() 
	   {
	      return Arrays.asList(new Object[][] {
	   	   { "Danish","kykyliky"},
		   {"Dutch","kukeleku"},
		   {"Finnish","kukko kiekuu"},
		   {"French","cocorico"},
		   {"German","kikeriki"},
		   {"Greek","kikiriki"},
		   {"Hebrew","coo-koo-ri-koo"},
		   {"Hungarian","kukuriku"},
		   {"Italian","chicchirichi"},
		   {"Japanese","ko-ke-kok-ko-o"},
		   {"Portuguese","cucurucu"},
		   {"Russian","kukareku"},
		   {"Swedish","kuckeliku"},
		   {"Turkish","kuk-kurri-kuuu"},
		   {"Urdu","kuklooku"},
		   {"English","Cock-a-doodle-doo"}
	      });
	   }
	   
	public RoosterTester(String input, String expectedResult) 
	{
      this.input = input;
      this.expectedResult = expectedResult;
    }
	
	@Test
	public void testRoosterSay()
	{
		System.out.println("Input Lang is : " + input );
		
		rooster.setLang( AnimalType.LANG.valueOf(input)  );
		String actualResult= rooster.say();
		
		System.out.println("Actual result is  : " + actualResult + ", expectedResult is "+expectedResult+"\n");
		
		
		assertEquals(expectedResult,actualResult );
	}
	
   public static void main(String[] args) 
   {
	      Result result = JUnitCore.runClasses(RoosterTester.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println("Test Result :" +result.wasSuccessful());
   }
}
