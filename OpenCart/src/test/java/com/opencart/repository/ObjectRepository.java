package com.opencart.repository;

/*
 * All the locators values are mentioned here
 * 
 * Naming Rule:
 * For link and partial link text locator => add Link as suffix  
 * Rest of the locators use relative xpath tricks 
 */

public class ObjectRepository {
	
	//Home Page Object Repository
	//Title
	public static final String homePageTitleXpath = "//img[@title='Your Store']";
	
	//Header Elements
	public static final String currencyDropdownXpath = "//form[@id='form-currency']";
	public static final String euroCurrencyLink = "€ Euro";
	public static final String poundCurrencyLink = "£ Pound Sterling";
	public static final String dollarCurrencyLink = "$ US Dollar";
	public static final String contactNumberXpath = "//span[normalize-space()='123456789']";
	public static final String contactUsXpath = "(//li[@class='list-inline-item'])[3]/a";
	public static final String myAccountXpath = "//span[normalize-space()='My Account']";
	public static final String registerXpath = "//a[normalize-space()='Register']";
	public static final String loginXpath = "//a[@class='dropdown-item'][normalize-space()='Login']";
	public static final String wishlistXpath = "//a[@id='wishlist-total']";
	public static final String shoppingCartXpath = "//a[@title='Shopping Cart']";
	public static final String checkoutXpath = "//a[@title='Checkout']";
	
	//Navigation Dropdowns
	public static final String desktopsLink = "Desktops";
	public static final String showAllDesktopsLink = "Show All Desktops";
	public static final String laptopsAndNotebooksLink = "Laptops & Notebooks";
	public static final String showAlllaptopsAndNotebooksLink = "Show All Laptops & Notebooks";
	public static final String componentsLink = "Components";
	public static final String showAllComponentsLink = "Show All Components";
	public static final String tabletsLink = "Tablets";
	public static final String softwaresLink = "Software";
	public static final String phonesAndPDAsLink = "Phones & PDAs";
	public static final String camerasLink = "Cameras";
	public static final String mp3PlayersLink = "MP3 Players";
	public static final String showAllMp3PlayersLink = "Show All MP3 Players";
	
	//Featured Products
	public static final String firstFeaturedProductXpath = "(//div//h4//a[1])[1]";
	public static final String firstFeaturedProductPriceXpath = "(//span[@class='price-new'])[1]";
}
