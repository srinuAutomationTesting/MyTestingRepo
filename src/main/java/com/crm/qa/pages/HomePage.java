package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.BaseClass;


public class HomePage extends BaseClass {

	// Page Factory

	@FindBy(xpath = "//img[@class='brand-image-xl logo-xl']")
	WebElement logo;

	@FindBy(xpath = "//i[@class='nav-icon far fa-user']//following-sibling::p")
	WebElement customerLink;

	@FindBy(xpath = "//li[@class='nav-item']//a[@class='nav-link']//p[text()=' Customers']")
	WebElement customerSubLink;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement addNewButton;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtMail;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPwdd;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement txtfName;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement txtlName;
	
	@FindBy(xpath = "//input[@id='Gender_Male']")
	WebElement radioMaleGender ;
	
	@FindBy(xpath = "//input[@id='DateOfBirth']")
	WebElement dateOfBirth;
	
	@FindBy(xpath = "//input[@id='Company']")
	WebElement companyName;
	
	
	
	@FindBy(xpath = "//select[@id='SelectedNewsletterSubscriptionStoreIds']//parent::div[1]")
	WebElement newsLetter;
	
	@FindBy(xpath = "//ul[@id='SelectedNewsletterSubscriptionStoreIds_listbox']//li[contains(text(),'Your store name')]")
	WebElement yourstoreadmin;
	
	
	
	//@FindBy(xpath = "//select[@id='SelectedCustomerRoleIds']//parent::div")
	@FindBy(xpath = "//select[@id='SelectedCustomerRoleIds']")
	WebElement txtCustomerRoles;
	
	@FindBy(xpath = "//select[@id='SelectedCustomerRoleIds']//parent::div[1]//select//option[3]")
	WebElement reg;
	
	@FindBy(xpath = "//select[@id='VendorId']")
	WebElement setManagerVendor;
	
	@FindBy(xpath = "//select[@id='VendorId']//option[2]")
	WebElement vendor1;
	
	@FindBy(xpath = "//input[@id='Active']")
	WebElement checkBox1;
	
	@FindBy(xpath = "//textarea[@id='AdminComment']")
	WebElement textArea;
	
	@FindBy(xpath = "//button[@name='save']")
	WebElement saveButton;
	
	//txt
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissable']")
	WebElement txtforCustomeradded;
	
	
	


	// Initializing Page Objects
	public HomePage() throws IOException {

		PageFactory.initElements(driver, this);

	}

	// Actions

	public void addCustomer() throws InterruptedException {

		// logo
		boolean logoo = logo.isDisplayed();
		System.out.println("logoo is displayes :" + logoo);

		// title

		String title = driver.getTitle();
		System.out.println("Title is :" + title);

		// customer link

		customerLink.click();
		Thread.sleep(2000);

		// customer sublink

		customerSubLink.click();
		Thread.sleep(2000);

		// addNew

		addNewButton.click();
		Thread.sleep(2000);
		
		//Fields
		
		txtMail.sendKeys("srinu123@gmail.com");
		txtPwdd.sendKeys("srinu123");
		txtfName.sendKeys("srinu");
		txtlName.sendKeys("adari");
		radioMaleGender.click();
		dateOfBirth.sendKeys("10/21/1996");
		companyName.sendKeys("capgemini");
		checkBox1.click();
		newsLetter.click();
		yourstoreadmin.click();
		//txtCustomerRoles.click();
		
//		Select select = new Select(txtCustomerRoles);
//		select.selectByValue("Guests");
		
		//reg.click();
		setManagerVendor.click();
		vendor1.click();
		checkBox1.click();
		textArea.sendKeys("Testing the application");
		saveButton.click();
		
		Thread.sleep(2000);
		
		 txtforCustomeradded.isDisplayed();
		System.out.println("Customer added successfully");
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
