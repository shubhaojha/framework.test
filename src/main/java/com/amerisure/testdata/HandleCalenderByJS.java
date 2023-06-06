package com.amerisure.testdata;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCalenderByJS {

	public static Properties prop;
	public static WebDriver driver;
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shobha.ojha\\eclipse-workspace1\\framework.test\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// date is web element
		WebElement date= driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']"));
		String dateVal= "21-05-2023";
		selectDateByJS(dateVal, date ,driver);
		
	}
	//WebElememt element is nothing but date
	public static void selectDateByJS(String dateVal, WebElement element,WebDriver driver) {
		JavascriptExecutor js=  ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
		
	}
}
