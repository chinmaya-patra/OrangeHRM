package com.automation.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.utilities.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	
	
@Test
public void loginApp() {
	
	
	
driver=	BrowserFactory.startApplication(driver, "chrome", "http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
    System.out.println(driver.getTitle());

}
}
