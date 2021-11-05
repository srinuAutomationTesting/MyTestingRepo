package com.crm.qa.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
//import org.junit.Test;

import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.BaseClass;

import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass 
{
   LoginPage page ;
   Logger log = Logger.getLogger(LoginPageTest.class);
  // HomePage homePage;

public LoginPageTest() throws IOException {
		super();
	}

  @BeforeMethod()
  public void setUp() throws IOException{
	  initilaization();
	  log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
	  
	  log.info("****************************** Starting test cases execution  *****************************************");
	  page = new LoginPage();
  }
  @Test(priority = 1)
  public void validateTitleTest()
  {
	String title = page.validateTitle();
	log.info("****************************** starting test case *****************************************");
	log.info("****************************** validateTitleTest *****************************************");
	
	Assert.assertEquals(title,"Your store. Login");
	System.out.println(title);
	
  }
 
  @Test(priority = 2)
  public void validateTextIsPresentTest()
  {
	  log.info("****************************** starting test case *****************************************");
		log.info("****************************** freeCrmTitleTest *****************************************");
	boolean text = page.validateTextPresent();
	System.out.println(text);
  }
  
  @Test(priority = 3)
  public void loginTest() throws IOException {
	  log.info("****************************** starting test case *****************************************");
		log.info("****************************** freeCrmTitleTest *****************************************");
	  page.login(prop.getProperty("email"), prop.getProperty("password"));
	 
  } 
  
  @AfterMethod()
  public void closeBrowser() {
	  log.info("****************************** Browser is closed *****************************************");
	  driver.quit();
  }

}
