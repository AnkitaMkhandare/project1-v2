package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressFillingPage {

	private WebDriver driver;

	public AddressFillingPage(WebDriver driver) {
		this.driver = driver;
	}

	private By welcomeField = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span");
	private By optionsField = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a");
	private By addresspPgeField = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[1]/a/span");
	private By addNewAddress = By.xpath("//span[text()='Add New Address']");
	private By telephoneField = By.id("telephone");
	private By streetField = By.id("street_1");
	private By cityField = By.id("city");
	
	private By regionField = By.id("region_id");
	private By postcodeField = By.id("zip");
	private By countryField = By.id("country");
	
	private By saveButton = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");

// Methods to interact with the elements
	public void welcomeField() {
		driver.findElement(welcomeField).click();
	}

	public void optionsField() {
		driver.findElement(optionsField).click();
	}

	public void addresspPgeField() {
		driver.findElement(addresspPgeField).click();
	}
	
	public void addNewAddress() {
		driver.findElement(addNewAddress).click();
	}

	public void telephoneField(String telephone) {
		driver.findElement(telephoneField).sendKeys(telephone);
		
	}

	public void streetField(String street) {
		driver.findElement(streetField).sendKeys(street);
	}

	public void cityField(String city) {
		driver.findElement(cityField).sendKeys(city);
	}

	public void countryField(String country) {
		driver.findElement(countryField).sendKeys(country);
	}
	
	public void regionField(String region) {
		driver.findElement(regionField).sendKeys(region);
	}

	public void postcodeField(String postcode) {
		driver.findElement(postcodeField).sendKeys(postcode);
	}

	
	public void saveButton () {
		driver.findElement(saveButton).click();
	}


	
	

}
