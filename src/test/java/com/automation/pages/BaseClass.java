package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ConfigDataProvider;
import com.automation.utilities.ExcelDataProvider;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excelData;
	public ConfigDataProvider configData;

	@BeforeSuite
	public void suitSetup() {
		excelData = new ExcelDataProvider();
		configData = new ConfigDataProvider();
	}

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, configData.getBrowser(), configData.getStaggingUrl());

	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);

	}

}
