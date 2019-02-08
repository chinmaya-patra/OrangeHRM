package com.automation.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.LoginPage;
import com.automation.utilities.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	
	
@Test
public void loginApp() {
	
	
	
driver=	BrowserFactory.startApplication(driver, "chrome", "http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
loginpage.loginToCrm("chinmaya", "inspiron1545");



System.out.println(driver.getTitle());

BrowserFactory.quitBrowser(driver);

}
}
