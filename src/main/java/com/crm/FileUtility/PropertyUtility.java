package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	
	public static String propertyLogic(String key) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("src\\test\\resources\\Vtiger.properties");
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
		
	
	}

}
