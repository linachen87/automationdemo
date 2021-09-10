package com.site.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.site.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'3. Add a User')]")
	WebElement AddUserEntrance;
	
	public HomePage() throws IOException{
		
		PageFactory.initElements(driver,this);
		
	}
	
	//action
	
	public void VerifyAddPageDisplay() {
		AddUserEntrance.click();
		
		
	}
	public String VerifyHomePageTitle() {
		return driver.getTitle();
	}


	

}
