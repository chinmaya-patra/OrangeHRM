package com.automation.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;

public class LoginTest extends BaseClass{
	
	
	
	
	
@Test
public void loginApp() {
LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
loginpage.loginToCrm("chinmaya", "inspiron1545");
System.out.println(driver.getTitle());
}






}
