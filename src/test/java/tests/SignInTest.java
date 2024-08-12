package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class SignInTest {

	private WebDriver driver;

    @BeforeSuite
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
    }

    
	@Test(priority = 1)
    public void testValidSignIn() {
        LoginPage loginPage = new LoginPage(driver);

 // Enter valid credentials
        loginPage.enterEmail("khandareanki@gmail.com");
        loginPage.enterPassword("Password-1");
        loginPage.clickSignIn();

        System.out.println("Valid SignIn completed successfully!");
        
    }

	@SuppressWarnings("deprecation")
    @Test(priority = 2)
    public void testInvalidSignIn() {
        LoginPage loginPage = new LoginPage(driver);

 // Enter invalid credentials
        loginPage.enterEmail("invalid@example.com");
        loginPage.enterPassword("InvalidPassword");
        loginPage.clickSignIn();

        System.out.println("Invalid SignIn attempted!");
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
   
}
