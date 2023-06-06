package com.amerisure.testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowseFileUplooad {

	public static WebDriver driver;
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shobha.ojha\\eclipse-workspace1\\framework.test\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		driver.get("https://www.naukri.com/mnjuser/profile");
		driver.findElement(By.id("attachCV")).sendKeys("C:/Users/shobha.ojha/Downloads/ShubhaResumeQA.pdf");
		
}
}