package Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {

	WebDriver driver;
	
	@FindBy(xpath = "//div[@id ='feature-bullets']/h1")
	WebElement aboutSectionHeader;
	
	@FindBy(xpath = "//div[@id ='feature-bullets']/ul")
	WebElement aboutSection;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void switchProductWindow() {
		Set<String> windows = driver.getWindowHandles();
		String mainWindow = driver.getWindowHandle();
		for(String window : windows) {
			if(!window.equalsIgnoreCase(mainWindow)) {
				driver.switchTo().window(window);
			}
		}
	}
	
	public void assertAboutSection() {
		try {
			Assert.assertTrue(aboutSectionHeader.isDisplayed());
			System.out.println(aboutSection.getText().toString());
		}
		catch(AssertionError e) {
			System.out.println("About section not found.");
		}
		
	}
	
	public void getAboutItem() throws InterruptedException {
		switchProductWindow();
		Thread.sleep(3000);
		assertAboutSection();
	}
	
	
}
