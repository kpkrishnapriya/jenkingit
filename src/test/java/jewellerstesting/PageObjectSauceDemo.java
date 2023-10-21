package jewellerstesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectSauceDemo {
	private WebDriver driver;

	public PageObjectSauceDemo() {
		this.driver = WebDriverManager.getDriver();
	}

	public WebElement sdUname() {

		return driver.findElement(By.cssSelector("#user-name"));
	}
	public WebElement sdPword() {

		return driver.findElement(By.cssSelector("#password"));
	}
	
	public WebElement sdLoginBtn() {

		return driver.findElement(By.cssSelector("#login-button"));
	}
	
	public List<WebElement> productTitle() {

		return driver.findElements(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
	}
	
	
	public  List<WebElement> sdLoginErrormsg() {

		return driver.findElements(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
	}
	public WebElement backPackAddcart() {

		return  driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
	}
	
	public WebElement shoppingCart() {

		return driver.findElement(By.cssSelector("#shopping_cart_container"));
	}
	
	
	
	public WebElement backToProducts() {

		return driver.findElement(By.cssSelector("#back-to-products"));
		
	}
	public WebElement checkOutBtn() {

		return driver.findElement(By.cssSelector("#checkout"));
		
	}
	public WebElement firstName() {

		return driver.findElement(By.cssSelector("#first-name"));
		
	}
	
	
}
