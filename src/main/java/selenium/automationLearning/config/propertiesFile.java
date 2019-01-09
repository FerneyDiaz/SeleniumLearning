package selenium.automationLearning.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import selenium.automationLearning.testing.test;

public class propertiesFile {

	private String browser = null, url = null;
	Properties propertiesObject = new Properties();
	
	
	public String getBrowser() {
		return this.browser;
	}
	
	public String getURL() {
		return this.url;
	}
	public void readProperties() throws Exception{
			InputStream inputFile = new FileInputStream(test.pathDriverBrowser+"\\src\\main\\java\\selenium\\automationLearning\\config\\config.properties");
			propertiesObject.load(inputFile);
			browser = propertiesObject.getProperty("browser");
			url = propertiesObject.getProperty("url");
	}
	
	public void writeProperties(String changeBrowser) throws Exception {
		OutputStream outputFile = new FileOutputStream(test.pathDriverBrowser+"\\src\\main\\java\\selenium\\automationLearning\\config\\config.properties");
		propertiesObject.setProperty("browser", changeBrowser);
		propertiesObject.store(outputFile, null);
		System.out.println("Prueba commit 2");
	}
	
}
