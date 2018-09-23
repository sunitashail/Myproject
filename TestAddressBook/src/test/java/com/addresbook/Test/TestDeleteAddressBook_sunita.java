package com.addresbook.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.addressbook.DeleteAddress_Sunita;

public class TestDeleteAddressBook_sunita {
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
	public void deleteaddresstest()
	{
		 new DeleteAddress_Sunita().deleteaddress(driver);
		
	}
	
	
	@AfterClass
	public void doafterclass()
	{
		System.out.println("Address book deleted");
	}
	

}
