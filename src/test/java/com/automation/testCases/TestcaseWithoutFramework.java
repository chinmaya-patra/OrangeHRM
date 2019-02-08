package com.automation.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestcaseWithoutFramework {

	@Test
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chinmaya\\Desktop\\webdrivers\\chromedriver.exe");
		
		
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
		
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("chinmaya");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("inspiron1545");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		String homepageTitle=driver.getTitle();
		
		
		Assert.assertEquals("OrangeHRM", homepageTitle);
		driver.quit();
		
	}
	

}
