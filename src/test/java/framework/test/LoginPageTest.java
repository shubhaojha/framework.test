package framework.test;
import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.IResultMap;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amerisure.base.BaseClassTest;
import com.amerisure.base.TestBase;
import com.amerisure.pages.HomePage;
import com.amerisure.pages.LoginPage;
import com.amerisure.pages.ModalWrapperLogin;
import com.amerisure.pages.SignUpPage;
/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;*/
import com.qa.opencart.listeners.ExtentReport1;
//import com.relevantcodes.extentreports.LogStatus;




public class LoginPageTest extends TestBase{
	
	String un = "ojhashobha28@gmail.com";
	   String pwd = "Shubhra@2";
	   public Logger logger;
		
	
	public static LoginPage loginPage;
	public static HomePage homePage;
	//public static ExtentTest test;
	public static ModalWrapperLogin modalWrapperLogin;
	//public static ExtentReports extent;


	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setUp() throws IOException{
		Initialization();
		loginPage = new LoginPage();	
		logger= LogManager.getLogger(this.getClass());
		/*
		 * SignUpPage signUp = new SignUpPage(); signUp.FirstTest();
		 */
		
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com");
		//logger.log(Status.INFO, "String Message to Log for Each Step in Test Case");
		//test.log(LogStatus.INFO, "First method");
		//test.pass("Image is as expected");
		logger.info("creating user");
		
	}
	/*
	 * @Test(priority=4) public void browseFileuploadTest(){ File file=
	 * loginPage.uploadFileTest(); }
	 */
	
	@Test(priority=2)
	public void NaukriLogoImageTest(){
		boolean flag = loginPage.validateNaukriImage();
		Assert.assertTrue(flag);
		
	
		
	//test.info("Image is as expected");
		
	}
	@Test(priority=3)
	public void loginSignupTest() throws InterruptedException{
		
		modalWrapperLogin= loginPage.loginSignupPage();
		
	}
	
	@Test(priority=4)
	public void loginTest(){
		homePage = loginPage.login(un,pwd);
				//login(prop.getProperty("username"),// prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();		
	}
	
}



