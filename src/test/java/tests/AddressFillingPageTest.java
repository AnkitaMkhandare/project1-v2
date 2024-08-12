package tests;

import org.testng.annotations.Test;

import Pages.AddressFillingPage;

public class AddressFillingPageTest extends BaseTest {
	private AddressFillingPage addressPage;

	@Override
	protected void initializePOM() {

		addressPage = new AddressFillingPage(driver); // Initialize the page object
	}

	@Test(priority = 1)
	private void validateAddressFilling() {
		addressPage.welcomeField();
		addressPage.optionsField();
		addressPage.addresspPgeField();
		addressPage.addNewAddress();
		addressPage.telephoneField("9988357398");
		addressPage.streetField("XXX");
		addressPage.countryField("India");
		addressPage.cityField("Mumbai");
		addressPage.regionField("Maharashra");
		addressPage.postcodeField("400001");
		
		addressPage.saveButton();

	}
}