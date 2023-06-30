package com.opencart.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.opencart.driverscript.TestBase;
import com.opencart.repository.ObjectRepository;

public class OpenCartHomePage extends TestBase {

	public WebDriver driver;
	public Actions mouseover;

	public OpenCartHomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = ObjectRepository.homePageTitleXpath)
	@CacheLookup
	WebElement homePageTitle;

	@FindBy(xpath = ObjectRepository.currencyDropdownXpath)
	@CacheLookup
	WebElement currencyDropDown;

	@FindBy(linkText = ObjectRepository.euroCurrencyLink)
	@CacheLookup
	WebElement euroCurrecy;

	@FindBy(linkText = ObjectRepository.poundCurrencyLink)
	@CacheLookup
	WebElement poundCurrecy;

	@FindBy(linkText = ObjectRepository.dollarCurrencyLink)
	@CacheLookup
	WebElement dollarCurrecy;

	@FindBy(xpath = ObjectRepository.contactNumberXpath)
	@CacheLookup
	WebElement contactNumber;

	@FindBy(xpath = ObjectRepository.contactUsXpath)
	@CacheLookup
	WebElement contactUs;

	@FindBy(xpath = ObjectRepository.myAccountXpath)
	@CacheLookup
	WebElement myAccount;

	@FindBy(xpath = ObjectRepository.registerXpath)
	@CacheLookup
	WebElement register;

	@FindBy(xpath = ObjectRepository.loginXpath)
	@CacheLookup
	WebElement login;

	@FindBy(xpath = ObjectRepository.wishlistXpath)
	@CacheLookup
	WebElement wishlist;

	@FindBy(xpath = ObjectRepository.shoppingCartXpath)
	@CacheLookup
	WebElement shoppingCart;

	@FindBy(xpath = ObjectRepository.checkoutXpath)
	@CacheLookup
	WebElement checkout;

	@FindBy(linkText = ObjectRepository.desktopsLink)
	@CacheLookup
	WebElement desktops;

	@FindBy(linkText = ObjectRepository.showAllDesktopsLink)
	@CacheLookup
	WebElement showAllDesktops;

	@FindBy(linkText = ObjectRepository.laptopsAndNotebooksLink)
	@CacheLookup
	WebElement laptopsAndNotebooks;

	@FindBy(linkText = ObjectRepository.showAlllaptopsAndNotebooksLink)
	@CacheLookup
	WebElement showAlllaptopsAndNotebooks;

	@FindBy(linkText = ObjectRepository.componentsLink)
	@CacheLookup
	WebElement components;

	@FindBy(linkText = ObjectRepository.showAllComponentsLink)
	@CacheLookup
	WebElement showAllComponents;

	@FindBy(linkText = ObjectRepository.tabletsLink)
	@CacheLookup
	WebElement tablets;

	@FindBy(linkText = ObjectRepository.softwaresLink)
	@CacheLookup
	WebElement softwares;

	@FindBy(linkText = ObjectRepository.phonesAndPDAsLink)
	@CacheLookup
	WebElement phonesAndPDAs;

	@FindBy(linkText = ObjectRepository.camerasLink)
	@CacheLookup
	WebElement cameras;

	@FindBy(linkText = ObjectRepository.mp3PlayersLink)
	@CacheLookup
	WebElement mp3Players;

	@FindBy(linkText = ObjectRepository.showAllMp3PlayersLink)
	@CacheLookup
	WebElement showAllMp3Players;

	@FindBy(xpath = ObjectRepository.firstFeaturedProductXpath)
	@CacheLookup
	WebElement firstFeaturedProduct;

	@FindBy(xpath = ObjectRepository.firstFeaturedProductPriceXpath)
	@CacheLookup
	WebElement firstFeaturedProductPrice;


	public void validateTitle(String expTitle) {

		String actTitle = homePageTitle.getAttribute("title");

		if(actTitle.equals(expTitle)) {
			System.out.println("Both Actual and Expected titles are same");
			System.out.println("Title is : " + actTitle);
			System.out.println();
		}
		else {
			System.out.println("Both Actual and Expected titles are not same");
			System.out.println("Expected Title is : " + expTitle);
			System.out.println("Actual Title is : " + actTitle);
			System.out.println();
		}
	}

	public void selectEuroCurrency() {
		currencyDropDown.click();
		String euro = euroCurrecy.getText();
		euroCurrecy.click();
		System.out.println("Currency Selected : " + euro);
	}

	public void selectPoundCurrency() {
		currencyDropDown.click();
		String pound = poundCurrecy.getText();
		poundCurrecy.click();
		System.out.println("Currency Selected : " + pound);
	}

	public void selectDollarCurrency() {
		currencyDropDown.click();
		String dollar = dollarCurrecy.getText();
		dollarCurrecy.click();
		System.out.println("Currency Selected : " + dollar);
		System.out.println();
	}

	public void navigateToContactUsPage() {
		String contactNum = contactNumber.getText();
		System.out.println("Contact Number : " + contactNum);
		contactUs.click();
		System.out.println("Successfully Navigated to Contact Us Page");
		System.out.println();
	}

	public void navigateToRegisterPage() {
		myAccount.click();
		register.click();
		System.out.println("Successfully Navigated to Register User Page");
		System.out.println();
	}

	public void navigateToLoginPage() {
		myAccount.click();
		login.click();
		System.out.println("Successfully Navigated to Login User Page");
		System.out.println();
	}

	public void navigateToWishlistPage() {
		wishlist.click();
		System.out.println("Successfully Navigated to Wishlist Page");
		System.out.println();
	}

	public void navigateToShoppingCartPage() {
		shoppingCart.click();
		System.out.println("Successfully Navigated to Shopping Cart Page");
		System.out.println();
	}

	public void navigateToCheckoutPage() {
		checkout.click();
		System.out.println("Successfully Navigated to Checkout Page");
		System.out.println();
	}	

	public void navigateToDesktopsPage() {
		mouseover = new Actions(driver);
		mouseover.moveToElement(desktops).perform();
		showAllDesktops.click();
		System.out.println("Successfully Navigated to Desktops Page");
		System.out.println();
	}

	public void navigateToLaptopsAndNotebooksPage() {
		mouseover = new Actions(driver);
		mouseover.moveToElement(laptopsAndNotebooks).perform();
		showAlllaptopsAndNotebooks.click();
		System.out.println("Successfully Navigated to Laptops and Notebooks Page");
		System.out.println();
	}

	public void navigateToComponentsPage() {
		mouseover = new Actions(driver);
		mouseover.moveToElement(components).perform();
		showAllComponents.click();
		System.out.println("Successfully Navigated to Components Page");
		System.out.println();
	}

	public void navigateToTabletsPage() {
		tablets.click();
		System.out.println("Successfully Navigated to Tablets Page");
		System.out.println();
	}

	public void navigateToSoftwaresPage() {
		softwares.click();
		System.out.println("Successfully Navigated to Softwares Page");
		System.out.println();
	}

	public void navigateToPhonesAndPDAsPage() {
		phonesAndPDAs.click();
		System.out.println("Successfully Navigated to Phones and PDA's Page");
		System.out.println();
	}

	public void navigateToCamerasPage() {
		cameras.click();
		System.out.println("Successfully Navigated to Cameras Page");
		System.out.println();
	}

	public void navigateToMp3PlayersPage() {
		mouseover = new Actions(driver);
		mouseover.moveToElement(mp3Players).perform();
		showAllMp3Players.click();
		System.out.println("Successfully Navigated to MP3 Players Page");
		System.out.println();
	}

	public void ValidateFirstFeaturedProduct() {
		homePageTitle.click();
		String productName = firstFeaturedProduct.getText();
		System.out.println("Name of First Featured Product is : " + productName);
		String productPrice = firstFeaturedProductPrice.getText();
		System.out.println("Name of First Featured Product is : " + productPrice);
		System.out.println();
	}
}
