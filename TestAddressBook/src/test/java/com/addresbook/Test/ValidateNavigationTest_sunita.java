package com.addresbook.Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.test.addressbook.Validate_Navigation_sunita;

public class ValidateNavigationTest_sunita {
    WebDriver driver;
	@BeforeClass
	public void dobeforclass(){
		/*System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		}
	
	@Test
	public void ValidateNavigationtest()
	{
		 new Validate_Navigation_sunita().navigation(driver);
	}
	
	@AfterClass
	public void doafterclass()
	{
		System.out.println("Navigation validated");
		driver.close();
	}
	
}
