package com.amerisure.testdata;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {
	public static WebDriver driver;
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shobha.ojha\\eclipse-workspace1\\framework.test\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		driver.get("https://www.ebay.com/");
		
		List <WebElement> linkCount= driver.findElements(By.tagName("a"));
		linkCount.size();
		System.out.println(linkCount.size());
		for(int i= 0; i<linkCount.size(); i++) {
		String text=	linkCount.get(i).getText();
		System.out.println(text);
		}
	

}
}