package com.WebTesting.Generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil 
{

	public static void selectBasedDropdownTest(WebElement ele,String value)
	{
		Select sc=new Select(ele);
		  System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
		  List<WebElement> allOptions=sc.getOptions();
		  System.out.println("Total options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
	}
}
