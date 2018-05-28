import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	
	public static WebDriver open(String browserType) {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		if(browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","/WelcomeToTheInternet/src/main/resources/webDriver/chromedriver.exe");
			return new ChromeDriver(chromeOptions);
		}
		
		if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","/WelcomeToTheInternet/src/main/resources/webDriver/geckodriver.exe");
			return new FirefoxDriver();
		}
		
		if(browserType.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.IE.driver", "/WelcomeToTheInternet/src/main/resources/webDriver/IEDriverServer.exe")
			return new InternetExplorerDriver();
		}
		
		else {
			System.setProperty("webdriver.gecko.driver", "/WelcomeToTheInternet/src/main/resources/webDriver/geckodriver.exe")
			return new FirefoxDriver();
		}
	}

}
