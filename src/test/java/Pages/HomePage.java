package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy(id = "nav-hamburger-menu")
	WebElement hamburger;
	
	@FindBy(xpath = "//div[contains(text(),'TV, Appliances, Electronics')]")
	WebElement tvAppElec;
	
	@FindBy(xpath = "//a[contains(text(),'Televisions')]")
	WebElement televisionOption;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickHamburger() {
		hamburger.click();
	}
	
	public void selectTvElecElec() {
		tvAppElec.click();
		
	}
	
	public void selectTelevisionOption() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		televisionOption.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	public void selectTelevision() throws InterruptedException {
		clickHamburger();
		selectTvElecElec();
		Thread.sleep(2000);
		selectTelevisionOption();
	}
	
}
