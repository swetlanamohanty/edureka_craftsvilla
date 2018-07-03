package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.Basepage;

public class KundanJewellerypage extends Basepage
{
	
public KundanJewellerypage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
	
}


@FindBy(xpath="//img[@src='https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-MSATY78408350090--Satyam_Jewellery_NX_-Craftsvilla_1.jpg']")
private WebElement pendant;


	public void choosependant()
	{
		verifyElementPresent(pendant);
		pendant.click();
		
	}
	
}
