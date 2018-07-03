package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.Basetest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pom.HomePage;
import com.craftsvilla.pom.signinPage;

public class signupscripts extends Basetest 

{
public HomePage hp=null;
public signinPage sp=null;

	@Test
	public void registerUser()
	{
		hp =new HomePage(driver);
		sp=new signinPage(driver);
		
			String[][] credentials=ReadExcel.getData(filepath,"new_user");
			 
			for(int i=1;i<credentials.length;i++)
			 {
				String email=credentials[i][0];
				String password=credentials[i][1];
				
				hp.clicksignIn();
				sp.enteremailid(email);
			    sp.clickcontinuebtn();
			    sp.enternewpassword(password);
			     sp.clickcheckbox();
			     sp.clickcheckbox();
			     sp.register();
			     
			 }
				 			
	}
}
