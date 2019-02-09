package com.automation.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void loginApp() {
		logger=reports.createTest("login to application");

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("logging in to the FreeCRM application");
		loginpage.loginToCrm(excelData.getStringData("login", 0, 0), excelData.getStringData("login", 0, 1));
		//System.out.println(driver.getTitle());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/orangehrm/symfony/web/webres_55a775cf9fcff8.50052456/themes/default/images/logo.png']")).isDisplayed());
		logger.pass("login to the application done succesfully");
	}

}
