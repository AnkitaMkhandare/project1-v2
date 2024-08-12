package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.RegistrationPage;

public class CreateNewAccountTest {

	private WebDriver driver;
	private RegistrationPage registrationPage;

	@BeforeSuite
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		registrationPage = new RegistrationPage(driver);
	}

	@Test(priority = 2)
	public void testSuccessfulRegistration() throws Exception {
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

// Fill in mandatory fields using POM methods
		registrationPage.enterFirstName("John");
		registrationPage.enterLastName("Doe");
		registrationPage.enterEmail("john.doe@gmail.com");
		registrationPage.enterPassword("secretpassword##001");
		registrationPage.confirmPassword("secretpassword##001");

// Submit the form
		registrationPage.clickRegisterButton();

// Navigate to another page (e.g., homepage)
		driver.navigate().to("https://magento.softwaretestingboard.com/");
	}

	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void testUnsuccessfulRegistration() throws Exception {
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

// Fill in invalid data (e.g., missing required fields)
		registrationPage.enterFirstName("Invalid");
		registrationPage.enterLastName("User");
		registrationPage.enterEmail("invalid-email"); // Invalid email format
		registrationPage.enterPassword("short"); // Short password
		registrationPage.confirmPassword("short");

// Submit the form
		registrationPage.clickRegisterButton();

// Print the output to the console
		System.out.println("Unsuccessful registration attempt: " + driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
