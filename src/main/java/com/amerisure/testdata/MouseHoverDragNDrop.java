package com.amerisure.testdata;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDragNDrop {
	
		public static Properties prop;
		public static WebDriver driver;
		public static void main(String args[]) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shobha.ojha\\eclipse-workspace1\\framework.test\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
			/*
			 * Alert alert = driver.switchTo().alert(); System.out.println(alert.getText());
			 * alert.accept();
			 */
			//driver.findElement(By.xpath("//div[text()='Add-ons']")).click();
		
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).build().perform();
	}

}
