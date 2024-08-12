package tests;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.Test;

import Pages.AddToCartPage;
import Pages.CheckoutPage;

public class CheckoutTest extends BaseTest {

	// private WebDriver driver;
	private CheckoutPage checkoutPage;
	private AddToCartPage addToCartPage;

	@Override
	protected void initializePOM() {

		checkoutPage = new CheckoutPage(driver); // Initialize the page object
		addToCartPage = new AddToCartPage(driver);
	}

	@Test(priority = 1)
	public void validateAddToCartFlow() {
		addToCartPage.navigateToWomenSection();
		addToCartPage.clickOnproductCategory();
		addToCartPage.clickOnSortByPrice();
		addToCartPage.clickOnProduct();
		addToCartPage.selectSizeAndColor();
		addToCartPage.clickAddToCart();
	}

	@Test(priority = 2)
	public void validateCheckoutFlow() throws TimeoutException {
		checkoutPage.cartButton();
		checkoutPage.ProceedToCheckout();
		checkoutPage.clickonNext();
		checkoutPage.clickOnPlace();

	}

}