package com.addresbook.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.addressbook.AddAddressBook;
import com.test.addressbook.Title;
import com.test.addressbook.editAddress;


public class TestAddressBook {

	public WebDriver driver;
	
	//AddAddressBook address;

	@BeforeClass
	public void doBefore() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http:\\a.testaddressbook.com");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() {
		Assert.assertEquals("Address Book", new Title().validateTitle(driver));
		
	}
	
	@Test (enabled=true)
	
	public void addAddress() {	
		Assert.assertEquals(true, new AddAddressBook(driver).addAddress());
		
	}
	
	@Test 
	
	public void editadd() {
		editAddress editadd1;
		editadd1 = new editAddress(driver);
		editadd1.editAdd(1);
		
		
	}

	@AfterClass

	public void doAfter() {
		driver.quit();
	}
}
