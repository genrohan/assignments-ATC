package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TelevisionSearchPage {

	WebDriver driver;
	List<String> price;
	
	@FindBy(xpath = "//div[@id='s-refinements']//span[contains(text(),'Samsung')]/preceding-sibling::div")
	WebElement brandSamsung;
	
	@FindBy(xpath = "//select[@name = 's']")
	WebElement sortButton;
	
	@FindBy(id = "s-result-sort-select_2")
	WebElement sortHighToLowOption;
	
	@FindBy(className = "a-price-whole")
	List<WebElement> itemPrices;
	
	public TelevisionSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectBrandSamsung() {
		brandSamsung.click();
	}
	
	public void sortHighToLow() {
		Select select = new Select(sortButton);
		select.getOptions().get(2).click();
	}
	
	public void itemPrice() {
		price = new ArrayList<String>(); 
		for(WebElement itemPrice : itemPrices) {
			price.add(itemPrice.getText().toString());
		}
		Collections.sort(price, Collections.reverseOrder());
	}
	
	public void selectSecondHighestPrice() throws InterruptedException {
//		itemPrice();
//		driver.findElement(By.xpath("//span[contains(text(),'"+price.get(1)+"')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='a-price'])[2]")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	
	
}
