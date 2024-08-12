package tests;


import org.testng.annotations.Test;

import Pages.AddToCartPage;

public class AddToCartTest extends BaseTest {
	private AddToCartPage addToCartPage;
	
	
	@Override
	protected void initializePOM() {

		addToCartPage = new AddToCartPage(driver); // Initialize the page object
	}
	
	
	@Test(description = "Validate add to cart flow")
	public void validateAddToCartFlow() {
		
		addToCartPage.navigateToWomenSection();
		addToCartPage.clickOnproductCategory();
		addToCartPage.clickOnSortByPrice();
		addToCartPage.clickOnProduct();
		addToCartPage.selectSizeAndColor();
		addToCartPage.clickAddToCart();
		addToCartPage.clickAddToWishList();

	}
	
	
	
	



}
