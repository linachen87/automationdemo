package com.site.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.site.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException{
		
		prop=new Properties();
		try {
			FileInputStream ip= new FileInputStream("C:\\Users\\winso\\eclipse-workspace\\DemoSite\\src\\main\\java\\com\\site\\qa"
					+ "\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    public static void initialization() {
	    String browserName = prop.getProperty("browser");
	    if (browserName.equals("chrome")) {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\winso\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
	    }else if (browserName.equals("Firefox")) {
		    System.setProperty("webdriver.gecko.driver","C:\\Users\\winso\\Downloads\\geckodriver.exe");
		    driver = new FirefoxDriver();
    }
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
   }
}
