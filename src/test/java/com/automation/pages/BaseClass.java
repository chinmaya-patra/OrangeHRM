package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automation.utilities.BrowserFactory;

public class BaseClass {
	public WebDriver driver;
	

	@BeforeClass
	public void setup() {
		driver=	BrowserFactory.startApplication(driver, "chrome", "http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
		
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
		
	}
	
	
	
	
	

}
