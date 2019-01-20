package com.qa.stepdefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MainPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class HomePageSteps extends TestBase{
	MainPage mainpage;
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^User is on Main Page$")
	public void user_is_on_Main_Page() throws Throwable {
		TestBase.initialization();
	    
	}

	@Then("^User clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() throws Throwable {
		mainpage=new MainPage();
		
		String title=mainpage.validateMainpagetitle();
		Assert.assertEquals("My Store", title);
		mainpage.ClickOnSignIn();
	}

	@Then("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginpage=new LoginPage();
	   String title=loginpage.ValidateLoginPageTitle();
	   
	   Assert.assertEquals("Login - My Store", title);
	}

	@Then("^User enters Email and password$")
	public void user_enters_Email_and_password() throws Throwable {
		homepage=new HomePage();
		homepage=loginpage.Login(prop.getProperty("Email"), prop.getProperty("password"));   
	}

	

	@Then("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		homepage=new HomePage();
		homepage.clickwomen();
		homepage.getTitlebeforeclick();
	}


@Then("^Click on Tshirts tab$")
public void click_on_Tshirts_tab() throws Throwable {
	homepage=new HomePage();
	homepage.hoverwomen();
	homepage.getTitleafterclick();
}

@And("^Close the browser$")
public void Close_the_browser() {
	driver.close();
}
}
