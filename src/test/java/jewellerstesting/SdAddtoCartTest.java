package jewellerstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import jewellerstesting.LoginTest;
import util.TestListener;
@Listeners({ TestListener.class })
public class SdAddtoCartTest {
	WebDriver driver;
	PageObjectSauceDemo sd;
	LoginTest lgtest;
	
	
	@BeforeTest
	public void setup()  {
		driver = WebDriverManager.getDriver();
		 sd = new PageObjectSauceDemo();
		 lgtest= new LoginTest();
		 lgtest.setup();
	}
//@Test
//public void addTocart() throws InterruptedException {
//	lgtest.login();	
//	sd.backPackAddcart().click();
//	sd.shoppingCart().click();
//	sd.checkOutBtn().click();
//}

@Test
public void dragAndDrop() {
	driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	WebElement sourceelemnt = driver.findElement(By.id("column-a"));
	WebElement targetelement = driver.findElement(By.id("column-b"));
	String initialTextSource = sourceelemnt.getText();
    String initialTextTarget = targetelement.getText();

	 Actions actions = new Actions(driver);
	 actions.dragAndDrop(sourceelemnt, targetelement).build().perform();
	 String finalTextSource = sourceelemnt.getText();
	    String finalTextTarget = targetelement.getText();
	    Assert.assertEquals(finalTextSource, initialTextTarget, "Text of column-a did not swap with column-b");
	    Assert.assertEquals(finalTextTarget, initialTextSource, "Text of column-b did not swap with column-a");	 
}
@Test
public void dropdown() {
	driver.get("https://the-internet.herokuapp.com/dropdown");
	WebElement dropdownTest = driver.findElement(By.id("dropdown")); 
	 Select dropdown = new Select(dropdownTest);
	 dropdown.selectByIndex(1);
	
}

@AfterSuite
public void drvierclose() {
	driver.quit();
}
	
}
