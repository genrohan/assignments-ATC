package util;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	
	public static WebDriver driver;
	Data data;
	
	
	@BeforeTest
	public void setUp() throws MalformedURLException {

		try {
			ChromeOptions capabilities = new ChromeOptions();
			capabilities.setCapability("browserName", "chrome");
			capabilities.setCapability("platform", "Windows 10");
	
	
			data = new Data();
			
			driver = new RemoteWebDriver(new URL("http://"+Data.getHubIP()+":"+Data.getPortNumber()), capabilities);
		}
		catch(SessionNotCreatedException e) {
			driver = new ChromeDriver();
		}
		
		driver.get(data.getUrl());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	 
	@AfterTest
	public void end() {
		driver.close();
		driver.quit(); 
	}
	
}
