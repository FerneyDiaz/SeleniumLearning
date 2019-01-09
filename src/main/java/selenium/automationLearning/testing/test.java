package selenium.automationLearning.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import selenium.automationLearning.config.propertiesFile;

public class test {

	public static String pathDriverBrowser = System.getProperty("user.dir");
	private String browser = null;
	private String url = null;
	propertiesFile pFile = new propertiesFile();
	public static WebDriver driver;
	
	public void setURL(String URL) {
		this.url = URL;
	}

	public String getURL() {
		return this.url;
	}

	public void setBrowser(String Browser) {
		this.browser = Browser;
	}

	public String getBrowser() {
		return this.browser;
	}

	public void browserConfig() throws Exception {
		pFile.readProperties();
		if (pFile.getBrowser().toLowerCase().trim().contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", pathDriverBrowser + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (pFile.getBrowser().toLowerCase().trim().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", pathDriverBrowser + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("Navegador no valido\n" + "recuerde que los navegadores deben ser chrome y firefox");
		}
	}

	public void runTest() throws Exception {
		pFile.writeProperties("Firefox");
		pFile.readProperties();
		driver.get(pFile.getURL());
		driver.quit();
	}
}
