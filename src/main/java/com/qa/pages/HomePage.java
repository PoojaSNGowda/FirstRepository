package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class HomePage extends TestBase{
	@FindBy(xpath="//a[@title='Women']")
	WebElement womentab;
	 
	@FindBy(xpath="//a[@title='Tops']//following::li[1]//a")
	WebElement Tshirts;
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	WebElement Fadedshirt;
	
	@FindBy(xpath="//a[@class='button ajax_add_to_cart_button btn btn-default']")
	WebElement AddTocartbtn;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement proceedtocheckout;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	WebElement proceddtocheckoutOrder;
	
	@FindBy(xpath="//button[@name='processAddress' and @class='button btn btn-default button-medium']")
	WebElement proceedtocheckoutaddress;
	
	@FindBy(xpath="//button[@name='processCarrier' and @class='button btn btn-default standard-checkout button-medium']")
	WebElement proceedtocheckoutcarrier;
	
	@FindBy(xpath="//a[@title='Close']")
	WebElement close;
	
	@FindBy(xpath="//a[@class='iframe']//preceding-sibling::label//preceding-sibling::div//child::input")
	WebElement agreecheckbox;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickwomen() {
		womentab.click();
	}
	public String getTitlebeforeclick() {
		return driver.getTitle();
	}
	
	public void hoverwomen() throws InterruptedException {
		Actions hover=new Actions(driver);
		hover.moveToElement(womentab).build().perform();
	    Tshirts = TestUtil.explicitwait("//a[@title='Tops']//following::li[1]//a");
		//mouseoverwomen.perform();
		Tshirts.click();
		
	}
	
	
	
	public String getTitleafterclick() {
		return  driver.getTitle();
	}
	
}
