package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro = new Properties();

	public ConfigDataProvider() {
		try {
			File src = new File("./config/config.properties");
			FileInputStream input = new FileInputStream(src);
			pro.load(input);
		} catch (IOException e) {
			System.out.println("properties file is not loaded" + e.getMessage());
		}
	}

	public String getDataFromConfig(String key) {
		return pro.getProperty(key);

	}

	public String getBrowser() {
		return pro.getProperty("browser");
	}

	public String getStaggingUrl() {
		return pro.getProperty("qaUrl");
	}
}
