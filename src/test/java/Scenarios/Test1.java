package Scenarios;

import org.testng.annotations.Test;

import Pages.*;
import util.Base;

public class Test1 extends Base{

	HomePage hp;
	TelevisionSearchPage tsp;
	ProductPage pp;
	
	@Test
	public void test() throws InterruptedException {
		hp = new HomePage(driver);
		hp.selectTelevision();
		
		tsp = new TelevisionSearchPage(driver);
		tsp.selectBrandSamsung();
		tsp.sortHighToLow();
		tsp.selectSecondHighestPrice();
		
		pp = new ProductPage(driver);
		pp.getAboutItem();
	}
	
}
