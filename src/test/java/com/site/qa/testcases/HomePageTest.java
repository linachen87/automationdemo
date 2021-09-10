package com.site.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.site.qa.base.TestBase;
import com.site.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage homepage;
	
	public HomePageTest() throws IOException{
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		homepage=new HomePage();
	}
	
	@Test(priority=1)
	public void VerifyHomeTitle() {
		String title = homepage.VerifyHomePageTitle();
		Assert.assertEquals(title,"FREE example PHP code and online MySQL database - example username password protected site");
		
	}
	
//	@Test(priority=2)
//	public void VerifyHomePageAddUserlink() {
//		boolean flag= homepage.VerifyAddPageDisplay();
//		Assert.assertTrue(flag);
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
