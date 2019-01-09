package selenium.automationLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import selenium.automationLearning.config.propertiesFile;
import selenium.automationLearning.testing.test;

public class App {
	
	/**
	 * Set browser
	 * Set browser config
	 * Run test
	 * */
	public static void main(String[] args) {
		
		/*String pathProject = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				pathProject+"\\browserDrivers\\chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.google.com/");
		driverChrome.quit();
		
		System.setProperty("webdriver.gecko.driver", pathProject+"\\browserDrivers\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.google.com/");
		driverFirefox.quit();
		
		test t = new test();
		t.setBrowser("firefox");
		t.getBrowser();
		t.setURL("https://www.google.com/");
		t.browserConfig();
		t.runTest();
		*/
		
		test t = new test();
		try {
			
			t.browserConfig();
			t.runTest();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
