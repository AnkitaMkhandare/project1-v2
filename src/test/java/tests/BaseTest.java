package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.HomePage;
import Pages.LoginPage;

public abstract class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30, 0));
		driver.get("https://magento.softwaretestingboard.com/");
		commonSteps();
		initializePOM();
	}
	
	public void commonSteps() {
		
		// sigin
		LoginPage loginPage = new LoginPage(driver);
		HomePage homepage = new HomePage(driver);

		
		homepage.clickOnSignIn();
        // Enter valid credentials
        loginPage.enterEmail("khandareanki@gmail.com");
        loginPage.enterPassword("Password-1");
        loginPage.clickSignIn();
		
	}
	
	abstract protected void initializePOM();
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
