package com.Adactionhelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader  {
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\LINGARAJ\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\property\\com\\Adaction.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getURL() {
		String url = p.getProperty("Url");
		return url;
	}
	
	public String getCardNumber() {
		String CardNumber = p.getProperty("CardNumber");
		return CardNumber;
	}
	
	public String getCVV() {
		String CVVdetails = p.getProperty("Cvv");
		return CVVdetails;
	}
}
