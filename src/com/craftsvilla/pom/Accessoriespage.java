package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.Basepage;

public class Accessoriespage extends Basepage

{
public Accessoriespage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
	
}
@FindBy(linkText="Kundan Jewellery")
private WebElement kundanJewellery;

@FindBy(linkText="Temple Jewellery")
private WebElement templejewellery;

@FindBy(linkText="Watches")
private WebElement watches;

public void goTokundanjewellery()
{
	verifyElementPresent(kundanJewellery);
	kundanJewellery.click();


}
public void goToTemplejewellery()
{
	verifyElementPresent(templejewellery);
	templejewellery.click();
}
public void goTowatches()
{
	verifyElementPresent(watches);
	watches.click();
}

}
