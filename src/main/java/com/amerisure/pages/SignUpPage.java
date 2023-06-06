package com.amerisure.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SignUpPage {

	
	@Test
	public void FirstTest()
	{
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	        
	     // create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports();
	     //   extent.attachReporter(htmlReporter);
	        
	     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	        
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
			/*
			 * // log with snapshot test.fail("details",
			 * MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
			 * 
			 * // test with snapshot test.addScreenCaptureFromPath("screenshot.png");
			 */
	        
	        // calling flush writes everything to the log file
	     
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shobha.ojha\\eclipse-workspace\\Selenium\\Resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		   extent.flush();
	}
}


