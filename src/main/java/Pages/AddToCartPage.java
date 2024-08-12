package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddToCartPage {

	private WebDriver driver;

// Constructor to initialize the driver
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}

// Locators for elements on the page
	private By womenSectionLink = By.linkText("Women");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	private By productCategory = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[1]/a");
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

	private By sortingDropdown = By.xpath("//*[@id=\"sorter\"]");
	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	private By priceOption = By.xpath("//*[@id=\"sorter\"]/option[3]");

	private By productImage = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/a/span/span/img");
	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));

	private By sizeM = By.id("option-label-size-143-item-168");
	private By colorOption = By.id("option-label-color-93-item-59");
	private By addToCartButton = By.id("product-addtocart-button");
	private By addToWishList = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]");

// Methods to interact with elements
	public void navigateToWomenSection() {
		driver.findElement(womenSectionLink).click();
	}

	public void clickOnproductCategory() {
		driver.findElement(productCategory).click();
	}

	public void clickOnSortByPrice() {
		driver.findElement(sortingDropdown).click();
		driver.findElement(priceOption).click();
	}

	public void clickOnProduct() {
		driver.findElement(productImage).click();
	}

	public void selectSizeAndColor() {
		driver.findElement(sizeM).click();
		driver.findElement(colorOption).click();
	}

	public void clickAddToCart() {
		driver.findElement(addToCartButton).click();
	}

	public void clickAddToWishList() {
		driver.findElement(addToWishList).click();
	}

}
