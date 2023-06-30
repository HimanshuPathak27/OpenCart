package com.opencart.driverscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static FileInputStream fis;
	public static Properties config = new Properties();
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeSuite
	public WebDriver setup() throws FileNotFoundException, InterruptedException {

		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\opencart\\driverscript\\Configuration.properties");

		try {
			config.load(fis);
			System.out.println("Configuration file is loaded successfully");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		if(config.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Browser is launched");
		}

		if(config.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("Edge Browser is launched");
		}

		if(config.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser is launched");
		}

		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitwait")),TimeUnit.SECONDS);
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		System.out.println("Application is Launched Successfully");
		System.out.println();
		return driver;
	}

	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
			System.out.println("Application is closed successfully");
		}
	}

}