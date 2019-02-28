package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class loginPage extends TestBase{
	
	

	@FindBy(className="login-text")
	WebElement girisBtn;
		
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="userLoginSubmitButton")
	WebElement loginBtn;
	
	@FindBy(xpath="u//a[@class='close']")
	WebElement lightbox;
	
	
//initializing the page
	public loginPage() {
		PageFactory.initElements(driver, this);
	}

//Actions
	public String validationLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validationGiris() {
		return girisBtn.isDisplayed();
	}

	public void login (String nam ,String pass) {
		username.sendKeys("typhoon23");
		password.sendKeys("1071ta1071");
		loginBtn.click();
		
	}
}
