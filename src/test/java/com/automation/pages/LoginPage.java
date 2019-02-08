package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver=ldriver;
	}
	
	@FindBy(name="txtUsername") WebElement userNameBox;
	@FindBy(name="txtPassword") WebElement passwordBox;
	@FindBy(name="Submit") WebElement loginBtn;
	
	
	
	public void loginToCrm(String username,String password) {
		userNameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		loginBtn.click();
		
	}

}
