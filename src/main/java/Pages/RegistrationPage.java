package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	@FindBy(id = "firstname")
	private WebElement firstNameField;

	@FindBy(id = "lastname")
	private WebElement lastNameField;

	@FindBy(id = "email_address")
	private WebElement emailField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(id = "password-confirmation")
	private WebElement confirmPasswordField;

	@FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
	private WebElement registerButton;

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void confirmPassword(String confirmPassword) {
		confirmPasswordField.sendKeys(confirmPassword);
	}

	public void clickRegisterButton() {
		registerButton.click();
	}
}
