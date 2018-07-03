package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.craftsvilla.generic.Basetest;
import com.craftsvilla.pom.Accessoriespage;
import com.craftsvilla.pom.HomePage;
import com.craftsvilla.pom.KundanJewellerypage;

public class KundanJewelleryscripts extends Basetest


{
public HomePage homepage=null;
public Accessoriespage accessoriespage=null;
public KundanJewellerypage kundanpage=null;


@Test
public void TC_01_buykundan()
{
	homepage =new HomePage(driver);
	accessoriespage=new Accessoriespage(driver);
	kundanpage=new KundanJewellerypage(driver);
	
	try
	{
		homepage.goToAccessories();
		accessoriespage.goTokundanjewellery();
		kundanpage.choosependant();
		Assert.fail();
	}
	catch(Exception e)
	{
		Reporter.log("fail");
		
	}
}
 

}
