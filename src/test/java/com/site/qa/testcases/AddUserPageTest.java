package com.site.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.site.qa.base.TestBase;
import com.site.qa.pages.AddaUser;
import com.site.qa.pages.HomePage;

public class AddUserPageTest extends TestBase{
	
	HomePage homepage;
	AddaUser adduser;
	
	public AddUserPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		homepage = new HomePage();
		adduser = new AddaUser();
		homepage.VerifyAddPageDisplay();
	}
	
	@Test(priority=1)
	public void AddNewUser() {
		
		adduser.AddUser(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=2)
	public void LoginPageVerify() throws IOException {
		adduser.JumptoLoginPageVerify();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
