package com.test.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class editAddress {

	public WebDriver driver;
	
	public editAddress(WebDriver driver) {
		this.driver=driver;
	}
	
	

public int editAdd(int i) {
	//driver.findElement(By.id("sign-in")).click();
	
	driver.findElement(By.id("session_email")).click();
			
	driver.findElement(By.id("session_email")).sendKeys("ravan@gmail.com");
	
	driver.findElement(By.id("session_password")).click();
	
	driver.findElement(By.id("session_password")).sendKeys("Test1");
	
	/* Click on Sign in button */				
	driver.findElement(By.name("commit")).click();
	
	driver.findElement(By.xpath("//*[@id=\'navbar\']/div[1]/a[2]")).click();
	
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[6]/a")).click();
	
	driver.findElement(By.id("address_city")).sendKeys("edison");
	
	Select drpState = new Select(driver.findElement(By.id("address_state")));
	
	drpState.selectByVisibleText("Florida");
	
	driver.findElement(By.name("commit")).click();
	
	

	return 1;
}
}
