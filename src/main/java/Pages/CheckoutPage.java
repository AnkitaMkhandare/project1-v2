package Pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

	private WebDriver driver;
	

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}

	private By cartButton = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
	private By ProceedToCheckout = By.id("top-cart-btn-checkout");
	private By Nextbtn = By.xpath("//button/span[contains(text(),'Next')]");
	private By Placebtn =By.xpath("//button[@title='Place Order']");

	
	public void cartButton() {
		driver.findElement(cartButton).click();
	}
	public void ProceedToCheckout() {
		driver.findElement(ProceedToCheckout).click();
	}
	

	public void clickonNext(){
		
		WebElement element = driver.findElement(Nextbtn);
		driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr/td[1]/input")).click();
		element.click();
	}
	
	public void clickOnPlace() throws TimeoutException {
	    try {
	        WebElement element = driver.findElement(Placebtn);

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	        wait.until(ExpectedConditions.visibilityOf(element));
	        Thread.sleep(5000);
	        element.click();
	        
	        Thread.sleep(5000);
	        
	    } catch (NoSuchElementException e) {
	        System.err.println("Error: Element not found. Details: " + e.getMessage());
	   
	    } catch (Exception e) {

	        System.err.println("Error: An unexpected exception occurred. Details: " + e.getMessage());
	    }
	}
	
	
	
	
}	

