package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	@FindBy(id="email")
	WebElement EmailID;
	
	@FindBy(id="passwd")
	WebElement Password;
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	WebElement SignInToAccount;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage Login(String em,String pwd) {
		EmailID.sendKeys(em);
		Password.sendKeys(pwd);
		SignInToAccount.click();
		return new HomePage();
}
}
