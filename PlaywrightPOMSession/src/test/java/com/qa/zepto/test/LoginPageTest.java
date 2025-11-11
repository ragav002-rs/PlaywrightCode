package com.qa.zepto.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.zepto.base.BaseTest;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginurl() {
		String Actualloginurl = loginpage.getPageURl();
		Assert.assertEquals(Actualloginurl, prop.getProperty("url-LoginPage"));	
	}
	
	@Test
	public void performloginurl() {
		loginpage.performSignin(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	
	
	
	
}
