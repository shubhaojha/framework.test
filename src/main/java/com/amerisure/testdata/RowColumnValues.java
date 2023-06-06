package com.amerisure.testdata;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RowColumnValues {

	public static Properties prop;
	public static WebDriver driver;
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shobha.ojha\\eclipse-workspace1\\framework.test\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		int rowCount= driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colCount= driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		
		for(int i=2;i<rowCount;i++)
		{
			for(int j=1;j<colCount;j++) {
				String actValue= driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(actValue);
				if(actValue.equals("Roland Mendel"))
				{
					System.out.println(i+" : "+j);
					break;
				}
			}
		}
		
		for(int i=2;i<rowCount;i++) {
			String row1Val=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]")).getText();
			System.out.println(row1Val);
		}
}
}