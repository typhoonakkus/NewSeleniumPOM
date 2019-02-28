package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.qa.base.TestBase;
import com.qa.pages.loginPage;

public class LoginTest extends TestBase{
	
	loginPage LoginPage;
	
	public LoginTest() throws IOException {
		
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		
		initialization();
		LoginPage = new loginPage();
		
	}
	

}
