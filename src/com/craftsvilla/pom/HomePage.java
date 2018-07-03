package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.Basepage;

public class HomePage extends Basepage
{
//declaration
	@FindBy(xpath="//a[text()='ACCESSORIES ']")
	private WebElement accessories;
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement signIn;
	
	@FindBy(linkText="CRAFTSVILLA BRANDS")
	private WebElement craftsvillabrands;
	
	//initialization
	
	public HomePage(WebDriver driver)
	
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	//utilization
	public void goToAccessories()
	{
		verifyElementPresent(accessories);
		mousehover(accessories);
		
		}


	public void clicksignIn() 
	{
		
verifyElementPresent(signIn);
signIn.click();
		
	}

	public void goToCraftsvillabrand()
	{
		verifyElementPresent(craftsvillabrands);
		mousehover(craftsvillabrands);
	}
	
}
