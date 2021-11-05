package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import org.testng.Assert;

public class HomePageTest extends BaseClass {

	HomePage hpage;
	LoginPage lpage;
	

	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod()
	public void setUp() throws IOException {
		initilaization();
		hpage= new HomePage(); 
		lpage = new LoginPage();
		lpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void addCustomerTest() throws InterruptedException {
	
		hpage.addCustomer();
		
		}
		
	@AfterMethod()
	public void closeBroser() {
		//driver.quit();
	}

}
