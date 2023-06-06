package com.amerisure.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;*/

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	 
 
	/*
	 * public void TestBase() {
	 * 
	 * try { prop= new Properties(); FileInputStream fis= new
	 * FileInputStream(System.getProperty(
	 * "C:\\Users\\shobha.ojha\\eclipse-workspace1\\framework.test\\src\\main\\java\\com\\amerisure\\config\\config.properties"
	 * )); prop.load(fis); } catch (FileNotFoundException e1) {
	 * e1.printStackTrace(); } catch (IOException e) { e.printStackTrace(); } }
	 */
	 
	public void Initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shobha.ojha\\eclipse-workspace1\\framework.test\\src\\test\\resources\\chromedriver.exe");
		/*
		 * ChromeOptions options= new ChromeOptions();
		 * options.addArguments("--incognito");
		 */
		//WebDriver driver =new ChromeDriver();
		  ChromeOptions chromeOptions = new ChromeOptions();
          chromeOptions.setAcceptInsecureCerts(true);

          driver = new ChromeDriver(chromeOptions);
		/*
		 * if(browserName.equals("chrome")) {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\shobha.ojha\\eclipse-workspace\\Selenium\\Resources\\chromedriver.exe"
		 * ); driver= new ChromeDriver(); } else if (browserName.equals("FF")) {
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\shobha.ojha\\eclipse-workspace\\ecommerce.app\\src\\main\\resources\\geckodriver.exe"
		 * ); driver= new FirefoxDriver();
		 * 
		 * }
		 */

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.naukri.com/nlogin/login");
		

	}
	/*
	 * public void ExtentReport() { ExtentHtmlReporter htmlReporter = new
	 * ExtentHtmlReporter("Extent.html");
	 * 
	 * // create ExtentReports and attach reporter(s) ExtentReports extent = new
	 * ExtentReports(); extent.attachReporter(htmlReporter); // creates a toggle for
	 * the given test, adds all log events under it ExtentTest test =
	 * extent.createTest("MyFirstTest", "Sample description");
	 * test.info("This is passed");
	 */
	       
	        
	}

