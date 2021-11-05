package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	//PageFactory -Object Repository
	

	@FindBy(name="Email")
	WebElement Email;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
 
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signupButton;
	
	@FindBy(xpath="//strong[contains(text(),'Welcome, please sign in!')]")
	WebElement text;
	
	
	//Initializing the Page Factory
	public LoginPage() throws IOException
	{
     PageFactory.initElements(driver, this);
    }
	
	//Actions 
	
	public boolean validateTextPresent(){
	
		return text.isDisplayed();
		
			
	}
	public String validateTitle()
	{
	return driver.getTitle();
	
	}
	public HomePage login(String un,String pwd) throws IOException {
	    Email.clear();
		Email.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		loginButton.click();
		return new HomePage();
	}
	
	
}
	

	

	

