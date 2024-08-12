package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

// Locators
	private By userMenu = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span");
	private By signOutLink = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");
	private By signInLink = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickUserMenu() {
		driver.findElement(userMenu).click();
	}

	public void clickSignOutLink() {
		driver.findElement(signOutLink).click();
	}
	
	public void clickOnSignIn() {
		driver.findElement(signInLink).click();
	}
}
