package com.amerisure.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amerisure.base.BaseClassTest;
import com.amerisure.base.TestBase;

public class LoginPage extends TestBase {
	String un = "ojhashobha28@gmail.com";
	   String pwd = "Shubhra@2";
	
	//Page Factory - OR://input[@id='usernameField']
	@FindBy(xpath="//input[@id='usernameField']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='passwordField']")
	WebElement password;
	
	@FindBy(xpath="//a[text()='Login']")
	static
	WebElement loginSignupButton;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@id='register_Layer']")
	WebElement signUpBtn;
	
	@FindBy(xpath="//div[@class='nI-gNb-header__wrapper']//img[@class='fl nLogo']")
	WebElement naukriLogo;
	
	@FindBy(xpath= "//input[@id='attachCV']")
	WebElement uploadCV;


	//Initializing the Page Objects:
	public LoginPage()  throws IOException{
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
		
	}
 
	
	public boolean validateNaukriImage(){
		return naukriLogo.isDisplayed();
	}
	
	/*
	 * public File uploadFileTest() { return new
	Current Organization:
Designation:
Current Location:
Years of Experience:
Current CTC(Fix+Var/Bonus):
Offer in hand (Fix+ Var):
Expected CTC(Fix):
Notice Period:
Open for Gurgaon Location: * File("C:/Users/shobha.ojha/Downloads/ShubhaResumeQA.pdf");
	 * 
	 * }
	 */
	public ModalWrapperLogin loginSignupPage() throws InterruptedException {
		loginSignupButton.click();
		Thread.sleep(3000);
		return new ModalWrapperLogin();
		
	}

	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		    /*	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		    	*/
		return new HomePage();
	
	
	
}


}
