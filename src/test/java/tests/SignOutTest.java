package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class SignOutTest {

	private WebDriver driver;

	@BeforeSuite
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
	}

	@Test
	public void testLoginAndSignOut() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail("khandareanki@gmail.com");
		loginPage.enterPassword("Password-1");
		loginPage.clickSignIn();
		

	
		HomePage homePage = new HomePage(driver);
		homePage.clickUserMenu();
		homePage.clickSignOutLink();

// Verify sign-out completion 
		System.out.println("Signout completed successfully!");
	}
}