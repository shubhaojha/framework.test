package com.qa.opencart.listeners;

//import java.sql.Date;
import java.util.Calendar;
import java.util.Map;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
//import org.aspectj.apache.bcel.classfile.Method;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListener implements IReporter{
	 public static void main(String[] args) {
	        // start reporters
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	        
	     // create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports();
	    //    extent.attachReporter(htmlReporter);
	        
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
	        extent.flush();
	    }

	public void generateReport(java.util.List<XmlSuite> xmlSuites, java.util.List<ISuite> suites,
			String outputDirectory) {
		// TODO Auto-generated method stub
		
	}
}