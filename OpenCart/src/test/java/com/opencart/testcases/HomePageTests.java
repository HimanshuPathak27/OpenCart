package com.opencart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.opencart.driverscript.TestBase;
import com.opencart.pages.OpenCartHomePage;

public class HomePageTests extends TestBase{

	@Test(priority = 1)
	public void validatingOpenCartTitle() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.validateTitle("Your Store");
	}

	@Test(priority = 2)
	public void slectingEuroCurrency() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.selectEuroCurrency();
	}
	
	@Test(priority = 3)
	public void slectingPoundCurrency() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.selectPoundCurrency();
	}
	
	@Test(priority = 4)
	public void slectingDollarCurrency() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.selectDollarCurrency();
	}
	
	@Test(priority = 5)
	public void validatingContactUsPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToContactUsPage();
	}
	
	@Test(priority = 6)
	public void validatingRegisterUserPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToRegisterPage();
	}
	
	@Test(priority = 7)
	public void validatingLoginUserPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToLoginPage();
	}
	
	@Test(priority = 8)
	public void validatingWishlistPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToWishlistPage();
	}
	
	@Test(priority = 9)
	public void validatingShoppingCartPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToShoppingCartPage();
	}
	
	@Test(priority = 10)
	public void validatingCheckoutPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToCheckoutPage();
	}

	@Test(priority = 11)
	public void validatingDesktopsPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToDesktopsPage();
	}

	@Test(priority = 12)
	public void validatingLaptopsAndNotebooksPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToLaptopsAndNotebooksPage();
	}

	@Test(priority = 13)
	public void validatingComponentsPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToComponentsPage();
	}

	@Test(priority = 14)
	public void validatingTabletsPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToTabletsPage();
	}

	@Test(priority = 15)
	public void validatingSoftwaresPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToSoftwaresPage();
	}

	@Test(priority = 16)
	public void validatingPhonesAndPDAsPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToPhonesAndPDAsPage();
	}

	@Test(priority = 17)
	public void validatingCamerasPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToCamerasPage();
	}

	@Test(priority = 18)
	public void validatingMp3PlayersPageNavigation() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.navigateToMp3PlayersPage();
	}
	
	@Test(priority = 19)
	public void validatingFirstFeaturedProduct() {
		OpenCartHomePage home = PageFactory.initElements(driver, OpenCartHomePage.class);
		home.ValidateFirstFeaturedProduct();
	}
	
	
}
