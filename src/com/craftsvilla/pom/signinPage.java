package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.Basepage;

public class signinPage extends Basepage

{
	public signinPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="emailId")
	private WebElement emailid;
	
	@FindBy(id="continueBtn")
	private WebElement continuebtn;
	
	@FindBy(id="set-password")
	private WebElement setpwd;
	
	@FindBy(xpath="//div[text()='Register']")
	private WebElement registerbtn;
	
	@FindBy(xpath="//label[@for='term-checkbox']")
	private WebElement terms;
	
	public void enteremailid(String emailaddress)
	{
		verifyElementPresent(emailid);
		emailid.sendKeys(emailaddress);
		
		
	}
	
	public void enternewpassword(String pwd)
	{
		verifyElementPresent(setpwd);
		setpwd.sendKeys(pwd);
		
		
	}
	public void clickcontinuebtn()
	{
		verifyElementPresent(continuebtn);
		continuebtn.click();
		
		
	}
	public void register()
	{
		verifyElementPresent(registerbtn);
		registerbtn.click();
		
		
	}
	public void clickcheckbox()
	{
		verifyElementPresent(terms);
		terms.click();
		
		
	}
}
