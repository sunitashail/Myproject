package com.test.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.test.util.ExcelContext;
import com.test.util.TestContext;
/**
 *  this is smaill 
 * @author Sathish
 *
 */
public class AddAddressBook {

	public WebDriver driver;

	public AddAddressBook(WebDriver driver) {
		this.driver = driver;
	}

	public boolean addAddress() {
		
		try {
			driver.findElement(By.id("sign-in")).click();

			driver.findElement(By.id("session_email")).click();

			driver.findElement(By.id("session_email")).sendKeys(TestContext.getInstance().getUserName());

			driver.findElement(By.id("session_password")).click();

			driver.findElement(By.id("session_password")).sendKeys(TestContext.getInstance().getPassword());

			/* Click on Sign in button */
			driver.findElement(By.name("commit")).click();

			/* Click on Addresses link */
			driver.findElement(By.xpath("//*[@id='navbar']/div[1]/a[2]")).click();

			/* Click on New Address link */
			driver.findElement(By.xpath("/html/body/div/a")).click();
 
			/* Enter Address details */
			driver.findElement(By.name("address[first_name]"))
					.sendKeys(ExcelContext.getInstance().getAddress().getFirtName());

			driver.findElement(By.name("address[last_name]"))
					.sendKeys(ExcelContext.getInstance().getAddress().getLastName());

			driver.findElement(By.id("address_street_address"))
					.sendKeys(ExcelContext.getInstance().getAddress().getAddress());

			driver.findElement(By.id("address_secondary_address")).sendKeys("apt#123");

			driver.findElement(By.id("address_city")).sendKeys("Minneapolis");

			Select drpState = new Select(driver.findElement(By.id("address_state")));

			drpState.selectByVisibleText("Minnesota");

			driver.findElement(By.name("address[zip_code]")).sendKeys("55155");

			driver.findElement(By.name("address[country]")).click();

			// driver.findElement(By.id("address_birthday")).click();

			Actions act = new Actions(driver);
			// WebElement birthDate = (WebElement)
			// driver.findElements(By.id("address_birthday"));
			driver.findElement(By.id("address_birthday")).sendKeys("10/10/2010");

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementById('address_color').value ='#FFFFFF'");

			driver.findElement(By.id("address_age")).sendKeys("10");

			driver.findElement(By.id("address_phone")).sendKeys("1234567890");

			driver.findElement(By.id("address_interest_dance")).click();

			driver.findElement(By.id("address_interest_read")).click();

			driver.findElement(By.id("address_note")).sendKeys("gkhkjkhjkhjkhkjhj");

			driver.findElement(By.name("commit")).click();

			driver.findElement(By.xpath("//*[@id=\'navbar\']/div[1]/a[3]")).click();

			// birthDate.sendKeys("1980");
			// act.keyDown(Keys.SHIFT).keyDown(Keys.TAB).build().perform();

			// act.keyUp(Keys.SHIFT).keyUp(Keys.TAB).build().perform();
			// driver.findElement(By.id("address_birthday")).sendKeys("01");
			// birthDate.sendKeys("01");

			/*
			 * List<WebElement> allDates =
			 * driver.findElements(By.name("address[birthday]"));
			 * 
			 * ((WebElement) allDates).click();
			 * 
			 * ((WebElement) allDates).sendKeys(Keys.TAB);
			 * 
			 * ((WebElement) allDates).sendKeys("01");
			 * 
			 */

			/*
			 * 
			 * for(WebElement ele:allDates) { String month = ele.getText();
			 * if(month.equalsIgnoreCase("01")) { ele.click(); break; } } /* for(WebElement
			 * ele:allDates) { String date = ele.getText(); if(date.equalsIgnoreCase("01"))
			 * { ele.click(); break; } }
			 * 
			 * for(WebElement ele:allDates) { String year = ele.getText();
			 * if(year.equalsIgnoreCase("1990")) { ele.click(); break; } }
			 */

			// JavascriptExecutor js = (JavascriptExecutor)driver;
			// js.executeScript("document.getElementById('address_birthday').value='09'");

			System.out.println("executed");
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}

}
