package com.automation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver, String browserName,String url) {
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
		else if (browserName.equals("firefox")) {
			
		}
		else if (browserName.equals("ie")) {
			
		}
		else {
			System.out.println("we do not support the browser ");
		}
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}
	
	
	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();
		
	}

}
