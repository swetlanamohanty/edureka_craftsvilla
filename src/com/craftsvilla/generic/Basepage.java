package com.craftsvilla.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage 
{
public WebDriver driver=null;

public Basepage(WebDriver driver)
{
	this.driver=driver;
	
}

public void verifyTitle(String expt_title)
{
	WebDriverWait wait =new WebDriverWait(driver,10);
	try
	{
		wait.until(ExpectedConditions.titleContains(expt_title));
		String act_title=driver.getTitle();
		Assert.assertEquals(act_title, expt_title);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		Reporter.log("title doesnt match");
		
	}
}

  public void verifyElementPresent(WebElement ele)
   {
	WebDriverWait wait =new WebDriverWait(driver,10);
	try
	{
		wait.until(ExpectedConditions.visibilityOf(ele));
		Reporter.log(ele + "element found");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		Reporter.log(ele + "not found");
		
	}
}

  public void mousehover(WebElement ele)
  {
	  WebDriverWait wait =new WebDriverWait(driver,10);
	  try
	  {
		  Actions action =new Actions(driver);
		  action.moveToElement(ele).perform();
		  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
		  Reporter.log("unable to mouse hover" +ele);
	  }
  }
  
  public void handleAlert()
  {
	  WebDriverWait wait =new WebDriverWait(driver,10);
	  try 
	  {
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
	  }
	  catch(Exception e)
	  {
		  Reporter.log("no alerts found to switch");
	  }
  }
  
  public void handleDropDown(WebElement ele,String option)
  {
	  
  }

}


