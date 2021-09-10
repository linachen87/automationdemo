package com.site.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.site.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory O R
	@FindBy(name="username")
	WebElement loginuser;
	
	@FindBy(name="password")
	WebElement loginpass;
	
	@FindBy(name="FormsButton2")
	WebElement loginbutton;
	
	//initialize the page object
	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public String validateLoginPage() {
		
		return driver.getTitle();
		
	}
	
	public void LoginVerify(String un,String pw) {
		loginuser.sendKeys(un);
		loginpass.sendKeys(pw);
		loginbutton.click();
	}

}
