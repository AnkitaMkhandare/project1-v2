package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveProduct {

	private WebDriver driver;

// Constructor to initialize the driver
	public RemoveProduct(WebDriver driver) {
		this.driver = driver;
	}

	public void AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}

// Locators
	private By cartButton = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
	private By viewEditCart = By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a");
	private By productRemoveButton = By.xpath("*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]");
	////
	private By productCount = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]");
	private By priceElement = By
			.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/div[2]/div/table/tbody/tr[3]/td/strong/span");

// Methods to interact with elements
	
	public void cartButton() {
		driver.findElement(cartButton).click();
		driver.navigate().refresh();
	}
	
	public void viewEditCart() {
		driver.findElement(viewEditCart).click();
		driver.navigate().refresh();
	}

	public void removeProduct() {
		driver.findElement(productRemoveButton).click();
		driver.navigate().refresh();
	}

	public String getProductCount() {
		return driver.findElement(productCount).getText();
	}

	public String getTotalPrice() {
		return driver.findElement(priceElement).getText();
	}
}
