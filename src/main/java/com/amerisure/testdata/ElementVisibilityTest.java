package com.amerisure.testdata;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElementVisibilityTest {
	

	public static Properties prop;
	public static WebDriver driver;
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shobha.ojha\\eclipse-workspace1\\framework.test\\src\\test\\resources\\chromedriver.exe");
		
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
 boolean b1= driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();//displayed is if the button is available
 System.out.println(b1);
 
 boolean b2= driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();////enabled is if the button is highlighted
 System.out.println(b2);
 boolean b3= driver.findElement(By.xpath("//i[contains(@class,'resman-icon-check-box')]")).isSelected();// when checkbox is selected
 System.out.println(b3);

}}