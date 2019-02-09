package com.automation.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	//screenshot,popup handeling, windows handeling,
	public static String captureScreenshot(WebDriver driver,String testname) {
		String path="./Screenshots/"+testname+"_"+getCureentDateTime()+".png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(path));
		} catch (IOException e) {
			
		System.out.println("not able to take screenshot>>>"+e.getMessage());
		}
		
		return path;
	}
	
	public static String getCureentDateTime() {
		DateFormat format = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return format.format(currentDate);
		
	}

}
