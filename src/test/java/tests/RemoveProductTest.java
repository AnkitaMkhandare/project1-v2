package tests;

import org.testng.annotations.Test;

import Pages.RemoveProduct;
import Pages.AddToCartPage;

//import Pages.LoginPage;

public class RemoveProductTest extends BaseTest {
	private RemoveProduct removeProduct;
	private AddToCartPage addToCartPage;

	@Override
	protected void initializePOM() {
		
		removeProduct = new RemoveProduct(driver); // Initialize the page object
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

	@Test(priority = 2, description = "Validate remove product from cart flow")
	private void validateRemoveProduct() {
		removeProduct.cartButton();
		removeProduct.viewEditCart();
		removeProduct.removeProduct();
	}

	@Test(priority = 3)
	private void getProductCount() {
		String productCount = removeProduct.getProductCount();
		System.out.println("Product Count in Cart: " + productCount);
	}

	@Test(priority = 4)
	private void getTotalPrice() {
		String totalPrice = removeProduct.getTotalPrice();
		System.out.println("Total Price: " + totalPrice);
	}

}
