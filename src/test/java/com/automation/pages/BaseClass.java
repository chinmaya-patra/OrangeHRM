package com.automation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ConfigDataProvider;
import com.automation.utilities.ExcelDataProvider;
import com.automation.utilities.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excelData;
	public ConfigDataProvider configData;
	public ExtentReports reports;
	public ExtentTest logger;

	@BeforeSuite
	public void suitSetup() {
		excelData = new ExcelDataProvider();
		configData = new ConfigDataProvider();
		ExtentHtmlReporter extent=new ExtentHtmlReporter("./Reports/"+Helper.getCureentDateTime()+"freeCRM.html");
		reports=new ExtentReports();
		reports.attachReporter(extent);
		
		
	}

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, configData.getBrowser(), configData.getStaggingUrl());

	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE||result.getStatus()==ITestResult.SKIP) {
			String testMethodName=result.getMethod().getMethodName();
			//Helper.captureScreenshot(driver, testMethodName);
			logger.fail("test gets fail", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver, testMethodName)).build());
		}
		reports.flush();
	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);

	}

}
