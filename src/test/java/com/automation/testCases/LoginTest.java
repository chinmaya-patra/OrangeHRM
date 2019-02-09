package com.automation.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utilities.ExcelDataProvider;

public class LoginTest extends BaseClass {

	@Test
	public void loginApp() {

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginToCrm(excelData.getStringData("login", 0, 0), excelData.getStringData("login", 0, 1));
		System.out.println(driver.getTitle());
	}

}
