package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;

public class MainPage extends TestBase{
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement SignInBtn;
	
	public MainPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateMainpagetitle() {
		return driver.getTitle();
	}
	
	public LoginPage ClickOnSignIn() {
		SignInBtn.click();
		return new LoginPage();
	}
}
