package com.qa.orghrm.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProperties {

	private static Properties prop;

	private static Properties ReadConfigProperties() throws IOException {
		String propFilePath = System.getProperty("user.dir") + "\\com.qa.orghrm.config\\config.properties";
		FileInputStream fis = new FileInputStream(propFilePath);
		prop = new Properties();
		prop.load(fis);
		return prop;

	}
	
	public static String getConfigProp(String propertyName) throws IOException {
		prop = ReadConfigProperties();
		String propName = prop.getProperty(propertyName);
		return propName;
	}
}
