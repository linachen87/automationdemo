package com.site.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.site.qa.base.TestBase;

public class AddaUser extends TestBase{
	
	

	//page factory =OR
	@FindBy(xpath="//input[@name='username']")
	WebElement addusername;
	
	@FindBy(name="password")
	WebElement addpassword;
	
	@FindBy(name="FormsButton2")
	WebElement savebutton;
	
	@FindBy(xpath="//a[contains(text(),'4. Login')]")
	WebElement loginentrance;
	
	//@FindBy(xpath="//blockquote/b[contains(text(),prop.getProperty)]")
	
	
	public AddaUser() throws IOException{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void AddUser(String un,String pw) {
		
		addusername.sendKeys(un);
		addpassword.sendKeys(pw);
		savebutton.click();
	}
	
	public LoginPage JumptoLoginPageVerify() throws IOException {
		
		loginentrance.click();
		return new LoginPage();
		
	}
	
	
	
	

}
